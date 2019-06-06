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
		statistics.setBehaviorsPhrasesAfterMap(statisticsService
				.generatePhrasesMap(statistics.getBehaviorsPhrasesAfterMap(), request.getBehaviorsAfter()));
		statistics.setBehaviorsPhrasesBeforeMap(statisticsService
				.generatePhrasesMap(statistics.getBehaviorsPhrasesBeforeMap(), request.getBehaviorsBefore()));
		statistics.setBehaviorsPhrasesDuringMap(statisticsService
				.generatePhrasesMap(statistics.getBehaviorsPhrasesDuringMap(), request.getBehaviorsDuring()));

		statistics.setBehaviorsWordsAfterMap(
				statisticsService.generateWordsMap(statistics.getBehaviorsWordsAfterMap(), request.getBehaviorsAfter()));
		statistics.setBehaviorsWordsBeforeMap(statisticsService.generateWordsMap(statistics.getBehaviorsWordsBeforeMap(),
				request.getBehaviorsBefore()));
		statistics.setBehaviorsWordsDuringMap(statisticsService.generateWordsMap(statistics.getBehaviorsWordsDuringMap(),
				request.getBehaviorsDuring()));

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
