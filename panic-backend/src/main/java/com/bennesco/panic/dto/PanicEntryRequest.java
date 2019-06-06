package com.bennesco.panic.dto;

import java.util.Date;
import java.util.List;

public class PanicEntryRequest {
	
	private long id;
	private String userName;
	private Date date;
	private List<String> thoughtsBefore;
	private List<String> thoughtsDuring;
	private List<String> thoughtsAfter;
	private List<String> behaviorsBefore;
	private List<String> behaviorsDuring;
	private List<String> behaviorsAfter;
	
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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

}
