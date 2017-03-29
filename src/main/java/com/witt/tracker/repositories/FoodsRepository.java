package com.witt.tracker.repositories;

import com.witt.tracker.entities.Foods;

public class FoodsRepository extends CrudRepository<Foods, Long> {
	
		Foods findById(int id);

		Iterable<Foods> findAll();

}
