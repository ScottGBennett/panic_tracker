package com.bennesco.panic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bennesco.panic.model.EntryStatistics;
import com.bennesco.panic.repository.StatisticsRepository;

@RestController
@RequestMapping("/statistics")
@CrossOrigin(origins = "http://localhost:4200")
public class StatisticsController {

	@Autowired
	StatisticsRepository statRepository;
	
	@GetMapping(value="/all", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<EntryStatistics> getAllStatistics() {
		return statRepository.findAll();
	}
	
}
