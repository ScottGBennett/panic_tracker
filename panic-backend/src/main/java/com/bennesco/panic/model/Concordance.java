package com.bennesco.panic.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.bennesco.panic.constants.Constants;
import com.bennesco.panic.dto.PanicEntryRequest;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Concordance {
	
	@Id
	private String userName;
	
	@ElementCollection
	private Map<String, Integer> thoughtPhrasesBeforeMap;
	@ElementCollection
	private Map<String, Integer> thoughtPhrasesDuringMap;
	@ElementCollection
	private Map<String, Integer> thoughtPhrasesAfterMap;
	
	@ElementCollection
	private Map<String, Integer> behaviorsPhrasesBeforeMap;
	@ElementCollection
	private Map<String, Integer> behaviorsPhrasesDuringMap;
	@ElementCollection
	private Map<String, Integer> behaviorsPhrasesAfterMap;
	
	@ElementCollection
	private Map<String, Integer> thoughtWordsBeforeMap;
	@ElementCollection
	private Map<String, Integer> thoughtWordsDuringMap;
	@ElementCollection
	private Map<String, Integer> thoughtWordsAfterMap;
	
	@ElementCollection
	private Map<String, Integer> behaviorsWordsBeforeMap;
	@ElementCollection
	private Map<String, Integer> behaviorsWordsDuringMap;
	@ElementCollection
	private Map<String, Integer> behaviorsWordsAfterMap;
	
	Integer totalNumberOfAttacks;

	public Concordance() {
		thoughtPhrasesAfterMap = new HashMap<>();
		thoughtPhrasesBeforeMap = new HashMap<>();
		thoughtPhrasesDuringMap = new HashMap<>();
		
		thoughtWordsAfterMap = new HashMap<>();
		thoughtWordsBeforeMap = new HashMap<>();
		thoughtWordsDuringMap = new HashMap<>();
		
		behaviorsPhrasesAfterMap = new HashMap<>();
		behaviorsPhrasesBeforeMap = new HashMap<>();
		behaviorsPhrasesDuringMap = new HashMap<>();
		
		behaviorsWordsAfterMap = new HashMap<>();
		behaviorsWordsBeforeMap = new HashMap<>();
		behaviorsWordsDuringMap = new HashMap<>();
		
		totalNumberOfAttacks = 0;
		userName = "";
	}
	
	public void updateConcordances(PanicEntryRequest request) {
		updateBehaviorMaps(request);
		updateThoughtMaps(request);
	}
	
	private void updateThoughtMaps(PanicEntryRequest request) {
		generatePhraseMap(this.thoughtPhrasesBeforeMap, request.getThoughtsBefore());
		generatePhraseMap(this.thoughtPhrasesDuringMap, request.getThoughtsDuring());
		generatePhraseMap(this.thoughtPhrasesAfterMap, request.getThoughtsAfter());
		
		generateWordsMap(this.thoughtWordsBeforeMap, request.getThoughtsBefore());
		generateWordsMap(this.thoughtWordsDuringMap, request.getThoughtsDuring());
		generateWordsMap(this.thoughtWordsAfterMap, request.getThoughtsAfter());
		
	}

	private void updateBehaviorMaps(PanicEntryRequest request) {
		generatePhraseMap(this.behaviorsPhrasesBeforeMap, request.getBehaviorsBefore());
		generatePhraseMap(this.behaviorsPhrasesDuringMap, request.getBehaviorsDuring());
		generatePhraseMap(this.behaviorsPhrasesAfterMap, request.getBehaviorsAfter());
		
		generateWordsMap(this.behaviorsWordsBeforeMap, request.getBehaviorsBefore());
		generateWordsMap(this.behaviorsWordsDuringMap, request.getBehaviorsDuring());
		generateWordsMap(this.behaviorsWordsAfterMap, request.getBehaviorsAfter());
		
	}

	private void generatePhraseMap(Map<String, Integer> map, List<String> listOfPhrases) {
		for (String phrase : listOfPhrases) {
			String trimmedPhrase = trimString(phrase);
			if (isPhrase(phrase)) {
				addToMap(map, trimmedPhrase);
			}
		}
	}
	
	private void generateWordsMap(Map<String, Integer> map, List<String> listOfPhrases) {
		for (String phrase : listOfPhrases) {
			String trimmedPhrase = trimString(phrase);
			String[] wordsInPhrase = trimmedPhrase.split(" ");
			for (String word : wordsInPhrase) {
				if (shouldIncludeWord(word) ) {
					addToMap(map, word);
				}
			}
		}
		
	}

	private void addToMap(Map<String, Integer> map, String string) {
		if (map.containsKey(string)) {
			map.put(string, map.get(string)+1);
		} else {
			map.put(string, 1);
		}
	}
	
	private String trimString(String string) {
		return string.replaceAll("[^a-zA-Z0-9\\s'\\-]", "");
	}
	
	private boolean shouldIncludeWord(String word) {
		return !Constants.getExcludedWordsList().contains(word.toLowerCase());
	}
	
	private boolean isPhrase(String phrase) {
		return phrase.split(" ").length > 1;
	}
	
}
