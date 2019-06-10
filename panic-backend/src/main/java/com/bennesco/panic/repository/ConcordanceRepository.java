package com.bennesco.panic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bennesco.panic.model.Concordance;

public interface ConcordanceRepository extends JpaRepository<Concordance, Long>{
	Concordance findByUserName(String userName);
}
