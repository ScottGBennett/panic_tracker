package com.bennesco.panic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bennesco.panic.model.EntryStatistics;

public interface StatisticsRepository extends JpaRepository<EntryStatistics, Long>{
	EntryStatistics findByUserName(String userName);
}
