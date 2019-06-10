package com.bennesco.panic.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.bennesco.panic.dto.PanicEntryRequest;

public class ConcordanceTest {

	private static PanicEntryRequest request;
	
	private static Concordance concordance;
	
	@BeforeClass
	public static void setUp() {
		concordance = new Concordance();
		request = generateRequest();
		concordance.updateConcordances(request);
	}
	
	@Test
	public void testThoughtPhraseMapsWereCreated() {
		assertNotNull(concordance.getThoughtPhrasesAfterMap());
		assertNotNull(concordance.getThoughtPhrasesBeforeMap());
		assertNotNull(concordance.getThoughtPhrasesDuringMap());
	}
	
	@Test
	public void testBehaviorPhraseMapsWereCreated() {
		assertNotNull(concordance.getBehaviorsPhrasesAfterMap());
		assertNotNull(concordance.getBehaviorsPhrasesBeforeMap());
		assertNotNull(concordance.getBehaviorsPhrasesDuringMap());
	}
	
	@Test
	public void testThoughtWordMapsWereCreated() {
		assertNotNull(concordance.getThoughtWordsAfterMap());
		assertNotNull(concordance.getThoughtWordsBeforeMap());
		assertNotNull(concordance.getThoughtWordsDuringMap());
	}
	
	@Test
	public void testBehaviorWordMapsWereCreated() {
		assertNotNull(concordance.getBehaviorsWordsAfterMap());
		assertNotNull(concordance.getBehaviorsWordsBeforeMap());
		assertNotNull(concordance.getBehaviorsWordsDuringMap());
	}
	
	@Test
	public void testExcludedWords() {
		assertNull(concordance.getThoughtWordsDuringMap().get("I'm"));
		assertEquals(2, concordance.getBehaviorsWordsAfterMap().size());
	}
	
	@Test
	public void testNonStandardStrings() {
		assertEquals(Integer.valueOf(1), concordance.getThoughtWordsBeforeMap().get("do-this"));
	}

	private static PanicEntryRequest generateRequest() {
		PanicEntryRequest request = new PanicEntryRequest();
		request.setBehaviorsAfter(Arrays.asList("relaxing on the bed."));
		request.setBehaviorsBefore(Arrays.asList("looking at the computer."));
		request.setBehaviorsDuring(Arrays.asList("Hyperventilating on bed."));
		request.setThoughtsAfter(Arrays.asList("That was really bad."));
		request.setThoughtsBefore(Arrays.asList("I can't do-this anymore."));
		request.setThoughtsDuring(Arrays.asList("I'm going to die."));
		return request;
	}
}
