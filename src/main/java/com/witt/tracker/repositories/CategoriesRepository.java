package com.witt.tracker.repositories;

import com.witt.tracker.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoriesRepository extends CrudRepository<Category, Integer> {
	
	Category findOne(Integer id);

	Iterable<Category> findAll();

}
