package com.witt.tracker.repositories;

import com.witt.tracker.entities.Categories;

public class CategoriesRepository extends CrudRepository<Categories, Long> {
	
		Categories findById(int id);

		Iterable<Categories> findAll();

}
