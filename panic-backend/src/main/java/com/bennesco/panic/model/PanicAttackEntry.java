package com.bennesco.panic.model;

import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.bennesco.panic.dto.PanicEntryRequest;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
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
}
