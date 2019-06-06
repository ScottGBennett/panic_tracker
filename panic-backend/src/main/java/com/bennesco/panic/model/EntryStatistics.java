package com.bennesco.panic.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EntryStatistics {
	
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

	public EntryStatistics() {
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
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Map<String, Integer> getThoughtPhrasesBeforeMap() {
		return thoughtPhrasesBeforeMap;
	}

	public void setThoughtPhrasesBeforeMap(Map<String, Integer> thoughtPhrasesBeforeMap) {
		this.thoughtPhrasesBeforeMap = thoughtPhrasesBeforeMap;
	}

	public Map<String, Integer> getThoughtPhrasesDuringMap() {
		return thoughtPhrasesDuringMap;
	}

	public void setThoughtPhrasesDuringMap(Map<String, Integer> thoughtPhrasesDuringMap) {
		this.thoughtPhrasesDuringMap = thoughtPhrasesDuringMap;
	}

	public Map<String, Integer> getThoughtPhrasesAfterMap() {
		return thoughtPhrasesAfterMap;
	}

	public void setThoughtPhrasesAfterMap(Map<String, Integer> thoughtPhrasesAfterMap) {
		this.thoughtPhrasesAfterMap = thoughtPhrasesAfterMap;
	}

	public Map<String, Integer> getBehaviorsPhrasesBeforeMap() {
		return behaviorsPhrasesBeforeMap;
	}

	public void setBehaviorsPhrasesBeforeMap(Map<String, Integer> behaviorsPhrasesBeforeMap) {
		this.behaviorsPhrasesBeforeMap = behaviorsPhrasesBeforeMap;
	}

	public Map<String, Integer> getBehaviorsPhrasesDuringMap() {
		return behaviorsPhrasesDuringMap;
	}

	public void setBehaviorsPhrasesDuringMap(Map<String, Integer> behaviorsPhrasesDuringMap) {
		this.behaviorsPhrasesDuringMap = behaviorsPhrasesDuringMap;
	}

	public Map<String, Integer> getBehaviorsPhrasesAfterMap() {
		return behaviorsPhrasesAfterMap;
	}

	public void setBehaviorsPhrasesAfterMap(Map<String, Integer> behaviorsPhrasesAfterMap) {
		this.behaviorsPhrasesAfterMap = behaviorsPhrasesAfterMap;
	}

	public Map<String, Integer> getThoughtWordsBeforeMap() {
		return thoughtWordsBeforeMap;
	}

	public void setThoughtWordsBeforeMap(Map<String, Integer> thoughtWordsBeforeMap) {
		this.thoughtWordsBeforeMap = thoughtWordsBeforeMap;
	}

	public Map<String, Integer> getThoughtWordsDuringMap() {
		return thoughtWordsDuringMap;
	}

	public void setThoughtWordsDuringMap(Map<String, Integer> thoughtWordsDuringMap) {
		this.thoughtWordsDuringMap = thoughtWordsDuringMap;
	}

	public Map<String, Integer> getThoughtWordsAfterMap() {
		return thoughtWordsAfterMap;
	}

	public void setThoughtWordsAfterMap(Map<String, Integer> thoughtWordsAfterMap) {
		this.thoughtWordsAfterMap = thoughtWordsAfterMap;
	}

	public Map<String, Integer> getBehaviorsWordsBeforeMap() {
		return behaviorsWordsBeforeMap;
	}

	public void setBehaviorsWordsBeforeMap(Map<String, Integer> behaviorsWordsBeforeMap) {
		this.behaviorsWordsBeforeMap = behaviorsWordsBeforeMap;
	}

	public Map<String, Integer> getBehaviorsWordsDuringMap() {
		return behaviorsWordsDuringMap;
	}

	public void setBehaviorsWordsDuringMap(Map<String, Integer> behaviorsWordsDuringMap) {
		this.behaviorsWordsDuringMap = behaviorsWordsDuringMap;
	}

	public Map<String, Integer> getBehaviorsWordsAfterMap() {
		return behaviorsWordsAfterMap;
	}

	public void setBehaviorsWordsAfterMap(Map<String, Integer> behaviorsWordsAfterMap) {
		this.behaviorsWordsAfterMap = behaviorsWordsAfterMap;
	}

	public Integer getTotalNumberOfAttacks() {
		return totalNumberOfAttacks;
	}

	public void setTotalNumberOfAttacks(Integer totalNumberofAttacks) {
		this.totalNumberOfAttacks = totalNumberofAttacks;
	}
}
