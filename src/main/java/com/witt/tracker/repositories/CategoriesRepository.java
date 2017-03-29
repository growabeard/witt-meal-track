package com.witt.tracker.repositories;

import com.witt.tracker.entities.Categories;
import org.springframework.data.repository.CrudRepository;

public interface CategoriesRepository extends CrudRepository<Categories, Integer> {
	
	Categories findOne(Integer id);

	Iterable<Categories> findAll();

}
