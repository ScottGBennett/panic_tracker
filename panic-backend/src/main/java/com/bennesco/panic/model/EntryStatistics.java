package com.bennesco.panic.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
	private Map<String, Integer> behaviorPhrasesBeforeMap;
	@ElementCollection
	private Map<String, Integer> behaviorPhrasesDuringMap;
	@ElementCollection
	private Map<String, Integer> behaviorPhrasesAfterMap;
	
	@ElementCollection
	private Map<String, Integer> thoughtWordsBeforeMap;
	@ElementCollection
	private Map<String, Integer> thoughtWordsDuringMap;
	@ElementCollection
	private Map<String, Integer> thoughtWordsAfterMap;
	
	@ElementCollection
	private Map<String, Integer> behaviorWordsBeforeMap;
	@ElementCollection
	private Map<String, Integer> behaviorWordsDuringMap;
	@ElementCollection
	private Map<String, Integer> behaviorWordsAfterMap;
	
	Integer totalNumberOfAttacks;

	public EntryStatistics() {
		thoughtPhrasesAfterMap = new HashMap<>();
		thoughtPhrasesBeforeMap = new HashMap<>();
		thoughtPhrasesDuringMap = new HashMap<>();
		
		thoughtWordsAfterMap = new HashMap<>();
		thoughtWordsBeforeMap = new HashMap<>();
		thoughtWordsDuringMap = new HashMap<>();
		
		behaviorPhrasesAfterMap = new HashMap<>();
		behaviorPhrasesBeforeMap = new HashMap<>();
		behaviorPhrasesDuringMap = new HashMap<>();
		
		behaviorWordsAfterMap = new HashMap<>();
		behaviorWordsBeforeMap = new HashMap<>();
		behaviorWordsDuringMap = new HashMap<>();
		
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

	public Map<String, Integer> getBehaviorPhrasesBeforeMap() {
		return behaviorPhrasesBeforeMap;
	}

	public void setBehaviorPhrasesBeforeMap(Map<String, Integer> behaviorPhrasesBeforeMap) {
		this.behaviorPhrasesBeforeMap = behaviorPhrasesBeforeMap;
	}

	public Map<String, Integer> getBehaviorPhrasesDuringMap() {
		return behaviorPhrasesDuringMap;
	}

	public void setBehaviorPhrasesDuringMap(Map<String, Integer> behaviorPhrasesDuringMap) {
		this.behaviorPhrasesDuringMap = behaviorPhrasesDuringMap;
	}

	public Map<String, Integer> getBehaviorPhrasesAfterMap() {
		return behaviorPhrasesAfterMap;
	}

	public void setBehaviorPhrasesAfterMap(Map<String, Integer> behaviorPhrasesAfterMap) {
		this.behaviorPhrasesAfterMap = behaviorPhrasesAfterMap;
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

	public Map<String, Integer> getBehaviorWordsBeforeMap() {
		return behaviorWordsBeforeMap;
	}

	public void setBehaviorWordsBeforeMap(Map<String, Integer> behaviorWordsBeforeMap) {
		this.behaviorWordsBeforeMap = behaviorWordsBeforeMap;
	}

	public Map<String, Integer> getBehaviorWordsDuringMap() {
		return behaviorWordsDuringMap;
	}

	public void setBehaviorWordsDuringMap(Map<String, Integer> behaviorWordsDuringMap) {
		this.behaviorWordsDuringMap = behaviorWordsDuringMap;
	}

	public Map<String, Integer> getBehaviorWordsAfterMap() {
		return behaviorWordsAfterMap;
	}

	public void setBehaviorWordsAfterMap(Map<String, Integer> behaviorWordsAfterMap) {
		this.behaviorWordsAfterMap = behaviorWordsAfterMap;
	}

	public Integer getTotalNumberOfAttacks() {
		return totalNumberOfAttacks;
	}

	public void setTotalNumberOfAttacks(Integer totalNumberofAttacks) {
		this.totalNumberOfAttacks = totalNumberofAttacks;
	}
}
