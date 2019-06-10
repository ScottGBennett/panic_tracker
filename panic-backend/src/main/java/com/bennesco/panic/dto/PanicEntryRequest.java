package com.bennesco.panic.dto;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
}
