package com.bennesco.panic.model;

import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.bennesco.panic.dto.PanicEntryRequest;

@Entity
public class PanicAttackEntry {

	@Id
	@GeneratedValue
	private long id;
	@ElementCollection
	private List<String> thoughtsBefore;
	@ElementCollection
	private List<String> thoughtsDuring;
	@ElementCollection
	private List<String> thoughtsAfter;
	@ElementCollection
	private List<String> behaviorsBefore;
	@ElementCollection
	private List<String> behaviorsDuring;
	@ElementCollection
	private List<String> behaviorsAfter;
	private String userName;
	private Date date;
		
	public PanicAttackEntry() {
		super();
	}
	
	public PanicAttackEntry (PanicEntryRequest request) {
		this.setDate(request.getDate());
		this.setUserName(request.getUserName());
		this.setThoughtsBefore(request.getThoughtsBefore());
		this.setThoughtsAfter(request.getThoughtsAfter());
		this.setThoughtsDuring(request.getThoughtsDuring());
		this.setBehaviorsBefore(request.getBehaviorsBefore());
		this.setBehaviorsAfter(request.getBehaviorsAfter());
		this.setBehaviorsDuring(request.getBehaviorsDuring());
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public List<String> getThoughtsBefore() {
		return thoughtsBefore;
	}

	public void setThoughtsBefore(List<String> thoughts) {
		this.thoughtsBefore = thoughts;
	}

	public List<String> getThoughtsDuring() {
		return thoughtsDuring;
	}

	public void setThoughtsDuring(List<String> thoughtsDuring) {
		this.thoughtsDuring = thoughtsDuring;
	}

	public List<String> getThoughtsAfter() {
		return thoughtsAfter;
	}

	public void setThoughtsAfter(List<String> thoughtsAfter) {
		this.thoughtsAfter = thoughtsAfter;
	}
	public List<String> getBehaviorsBefore() {
		return behaviorsBefore;
	}

	public void setBehaviorsBefore(List<String> behaviorsBefore) {
		this.behaviorsBefore = behaviorsBefore;
	}

	public List<String> getBehaviorsDuring() {
		return behaviorsDuring;
	}

	public void setBehaviorsDuring(List<String> behaviorsDuring) {
		this.behaviorsDuring = behaviorsDuring;
	}

	public List<String> getBehaviorsAfter() {
		return behaviorsAfter;
	}

	public void setBehaviorsAfter(List<String> behaviorsAfter) {
		this.behaviorsAfter = behaviorsAfter;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
