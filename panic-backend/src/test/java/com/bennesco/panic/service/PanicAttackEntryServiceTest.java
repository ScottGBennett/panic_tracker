package com.bennesco.panic.service;

import static org.junit.Assert.fail;

import java.util.Arrays;

import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.bennesco.panic.dto.PanicEntryRequest;
import com.bennesco.panic.model.Concordance;
import com.bennesco.panic.model.PanicAttackEntry;
import com.bennesco.panic.repository.ConcordanceRepository;
import com.bennesco.panic.repository.PanicAttackEntryRepository;

@RunWith(MockitoJUnitRunner.class)
public class PanicAttackEntryServiceTest {
	
	@Mock
	PanicAttackEntryRepository panicRepository;

	@Mock
	ConcordanceRepository concordanceRepository;
	
	@InjectMocks
	PanicAttackEntryService panicService;
	
	private static PanicEntryRequest request;
	
	private static Concordance concordance;
	
	@BeforeClass
	public static void setUp() {
		concordance = new Concordance();
		request = generateRequest();
		concordance.updateConcordances(request);
	}

	@Test
	public void testEntrySaved() {
		panicService.savePanicAttack(request);
		verify(panicRepository).saveAndFlush(any(PanicAttackEntry.class));
	}
	
	@Test
	public void testConcordanceSaved() {
		panicService.savePanicAttack(request);
		verify(concordanceRepository).saveAndFlush(any(Concordance.class));
	}
	
	private static PanicEntryRequest generateRequest() {
		PanicEntryRequest request = new PanicEntryRequest();
		request.setBehaviorsAfter(Arrays.asList("relaxing on the bed."));
		request.setBehaviorsBefore(Arrays.asList("looking at the computer."));
		request.setBehaviorsDuring(Arrays.asList("Hyperventilating on bed."));
		request.setThoughtsAfter(Arrays.asList("That was really bad."));
		request.setThoughtsBefore(Arrays.asList("I can't do-this anymore."));
		request.setThoughtsDuring(Arrays.asList("I'm going to die."));
		request.setUserName("userName");
		return request;
	}

}
