package com.witt.tracker.repositories;

import java.sql.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.witt.tracker.entities.Progress;


public interface ProgressRepository extends CrudRepository<Progress, Integer> {

	Progress findBy(Integer id);
	
	Iterable<Progress> findAll();
	
	Progress save(Progress entity);

	@Query("select * from public.progress where updated = ?1")
	Iterable<Progress> getMatchingDate(Date date);
	
}
