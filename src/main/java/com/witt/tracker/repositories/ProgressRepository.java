package com.witt.tracker.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.witt.tracker.entities.Progress;


public interface ProgressRepository extends CrudRepository<Progress, String> {

	Progress findBy(String id);
	
	Iterable<Progress> findAll();
	
	Progress save(Progress entity);

	Iterable<Progress> findByUpdated(String updated);
	
	void delete(Progress entity);
	
}
