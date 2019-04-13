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
	private List<String> behaviorBefore;
	private List<String> behaviorDuring;
	private List<String> behaviorAfter;
	
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
	public List<String> getBehaviorBefore() {
		return behaviorBefore;
	}
	public void setBehaviorBefore(List<String> behaviorBefore) {
		this.behaviorBefore = behaviorBefore;
	}
	public List<String> getBehaviorDuring() {
		return behaviorDuring;
	}
	public void setBehaviorDuring(List<String> behaviorDuring) {
		this.behaviorDuring = behaviorDuring;
	}
	public List<String> getBehaviorAfter() {
		return behaviorAfter;
	}
	public void setBehaviorAfter(List<String> behaviorAfter) {
		this.behaviorAfter = behaviorAfter;
	}
}
