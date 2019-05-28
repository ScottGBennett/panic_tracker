package com.bennesco.panic.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bennesco.panic.constants.Constants;

@Service
public class StatisticsService {

	public Map<String, Integer> generatePhrasesMap(Map<String, Integer> phrasesMap, List<String> listOfPhrases) {
		for (String phrase : listOfPhrases) {
			String trimmedPhrase = trimString(phrase);
			addToMap(phrasesMap, trimmedPhrase);
			
		}
		return phrasesMap;
	}
	
	public Map<String, Integer> generateWordsMap(Map<String, Integer> wordsMap, List<String> listOfPhrases) {
		for (String phrase : listOfPhrases) {
			String trimmedPhrase = trimString(phrase);
			String[] wordsInPhrase = trimmedPhrase.split(" ");
			for (String word : wordsInPhrase) {
				if (shouldIncludeWord(word) ) {
					addToMap(wordsMap, word);
				}
			}
		}
		return wordsMap;
	}
	
	private void addToMap(Map<String, Integer> map, String string) {
		if (map.containsKey(string)) {
			map.put(string, map.get(string)+1);
		} else {
			map.put(string, 1);
		}
	}
	
	private String trimString(String string) {
		return string.replaceAll("[^a-zA-Z0-9'\\s]", "");
	}
	
	private boolean shouldIncludeWord(String word) {
		boolean shouldInclude = false;
		if (!Constants.getExcludedWordsList().contains(word.toLowerCase())) {
			shouldInclude = true;
		}
		return shouldInclude;
	}
}
