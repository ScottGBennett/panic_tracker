package com.bennesco.panic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bennesco.panic.model.PanicAttackEntry;

public interface PanicAttackEntryRepository extends JpaRepository<PanicAttackEntry, Long> {
	List<PanicAttackEntry> findByUserName(String userName);
}
