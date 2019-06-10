package com.bennesco.panic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bennesco.panic.dto.PanicEntryRequest;
import com.bennesco.panic.model.Concordance;
import com.bennesco.panic.model.PanicAttackEntry;
import com.bennesco.panic.repository.PanicAttackEntryRepository;
import com.bennesco.panic.repository.ConcordanceRepository;

@Service
public class PanicAttackEntryService {

	@Autowired
	PanicAttackEntryRepository panicRepository;

	@Autowired
	ConcordanceRepository concordanceRepository;

	public void savePanicAttack(PanicEntryRequest request) {
		Concordance concordance = concordanceRepository.findByUserName(request.getUserName());
		if (concordance == null) {
			concordance = new Concordance();
			concordance.setUserName(request.getUserName());
		}
		concordance.updateConcordances(request);
		concordance.setTotalNumberOfAttacks(concordance.getTotalNumberOfAttacks() + 1);
		panicRepository.saveAndFlush(new PanicAttackEntry(request));
		concordanceRepository.saveAndFlush(concordance);
		
	}
}
