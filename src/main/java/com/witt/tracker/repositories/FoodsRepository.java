package com.witt.tracker.repositories;

import com.witt.tracker.entities.Foods;
import org.springframework.data.repository.CrudRepository;

public interface FoodsRepository extends CrudRepository<Foods, Integer> {
	
	Foods findById(Integer id);

	Iterable<Foods> findAll();

}
