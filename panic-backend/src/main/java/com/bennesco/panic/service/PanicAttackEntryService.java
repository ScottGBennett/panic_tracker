package com.bennesco.panic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bennesco.panic.dto.PanicEntryRequest;
import com.bennesco.panic.model.EntryStatistics;
import com.bennesco.panic.model.PanicAttackEntry;
import com.bennesco.panic.repository.PanicAttackEntryRepository;
import com.bennesco.panic.repository.StatisticsRepository;

@Service
public class PanicAttackEntryService {

	@Autowired
	PanicAttackEntryRepository panicRepository;

	@Autowired
	StatisticsRepository statisticsRepository;

	@Autowired
	StatisticsService statisticsService;

	public void savePanicAttack(PanicEntryRequest request) {
		EntryStatistics statistics = statisticsRepository.findByUserName(request.getUserName());
		if (statistics == null) {
			statistics = new EntryStatistics();
			statistics.setUserName(request.getUserName());
		}
		updateStatistics(statistics, request);
		statistics.setTotalNumberOfAttacks(statistics.getTotalNumberOfAttacks() + 1);
		panicRepository.saveAndFlush(new PanicAttackEntry(request));
		statisticsRepository.saveAndFlush(statistics);
		
	}

	private void updateStatistics(EntryStatistics statistics, PanicEntryRequest request) {
		statistics.setBehaviorPhrasesAfterMap(statisticsService
				.generatePhrasesMap(statistics.getBehaviorPhrasesAfterMap(), request.getBehaviorAfter()));
		statistics.setBehaviorPhrasesBeforeMap(statisticsService
				.generatePhrasesMap(statistics.getBehaviorPhrasesBeforeMap(), request.getBehaviorBefore()));
		statistics.setBehaviorPhrasesDuringMap(statisticsService
				.generatePhrasesMap(statistics.getBehaviorPhrasesDuringMap(), request.getBehaviorDuring()));

		statistics.setBehaviorWordsAfterMap(
				statisticsService.generateWordsMap(statistics.getBehaviorWordsAfterMap(), request.getBehaviorAfter()));
		statistics.setBehaviorWordsBeforeMap(statisticsService.generateWordsMap(statistics.getBehaviorWordsBeforeMap(),
				request.getBehaviorBefore()));
		statistics.setBehaviorWordsDuringMap(statisticsService.generateWordsMap(statistics.getBehaviorWordsDuringMap(),
				request.getBehaviorDuring()));

		statistics.setThoughtPhrasesAfterMap(statisticsService
				.generatePhrasesMap(statistics.getThoughtPhrasesAfterMap(), request.getThoughtsAfter()));
		statistics.setThoughtPhrasesBeforeMap(statisticsService
				.generatePhrasesMap(statistics.getThoughtPhrasesBeforeMap(), request.getThoughtsBefore()));
		statistics.setThoughtPhrasesDuringMap(statisticsService
				.generatePhrasesMap(statistics.getThoughtPhrasesDuringMap(), request.getThoughtsDuring()));

		statistics.setThoughtWordsAfterMap(
				statisticsService.generateWordsMap(statistics.getThoughtWordsAfterMap(), request.getThoughtsAfter()));
		statistics.setThoughtWordsBeforeMap(
				statisticsService.generateWordsMap(statistics.getThoughtWordsBeforeMap(), request.getThoughtsBefore()));
		statistics.setThoughtWordsDuringMap(
				statisticsService.generateWordsMap(statistics.getThoughtWordsDuringMap(), request.getThoughtsDuring()));
	}
}
