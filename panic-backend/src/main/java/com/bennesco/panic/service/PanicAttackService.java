package com.bennesco.panic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bennesco.panic.dto.PanicEntryRequest;
import com.bennesco.panic.model.PanicAttackEntry;
import com.bennesco.panic.repository.PanicAttackEntryRepository;

@Service
public class PanicAttackService {

	@Autowired
	PanicAttackEntryRepository panicRepository;
	
	public void savePanicAttack(PanicEntryRequest request) {
		panicRepository.saveAndFlush(new PanicAttackEntry(request));
	}
}
