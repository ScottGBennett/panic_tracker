package com.bennesco.panic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bennesco.panic.dto.PanicEntryRequest;
import com.bennesco.panic.model.PanicAttackEntry;
import com.bennesco.panic.repository.PanicAttackEntryRepository;
import com.bennesco.panic.service.PanicAttackEntryService;

@RestController
@RequestMapping("/entry")
public class PanicAttackController {
	
	@Autowired
	PanicAttackEntryRepository panicRepository;
	
	@Autowired
	PanicAttackEntryService panicService;

	@GetMapping(value="/all", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<PanicAttackEntry> getAll(){
		return panicRepository.findAll();
	}
	
	@GetMapping(value="/{userName}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<PanicAttackEntry> getAllByUserName (@PathVariable String userName) {
		return panicRepository.findByUserName(userName);
	}
	
	@PostMapping(value="/submit", consumes = {MediaType.APPLICATION_JSON_VALUE})
	public HttpStatus submitNewPanicAttack(@RequestBody PanicEntryRequest entry) {
		panicService.savePanicAttack(entry);
		return HttpStatus.OK;
	}
}
