package com.bennesco.panic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bennesco.panic.model.Concordance;
import com.bennesco.panic.repository.ConcordanceRepository;

@RestController
@RequestMapping("/statistics")
public class ConcordanceController {

	@Autowired
	ConcordanceRepository statRepository;
	
	@GetMapping(value="/all", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Concordance> getAllStatistics() {
		return statRepository.findAll();
	}
	
}
