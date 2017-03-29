package com.witt.tracker.delegate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.witt.tracker.entities.Categories;
import com.witt.tracker.entities.Foods;
import com.witt.tracker.repositories.CategoriesRepository;
import com.witt.tracker.repositories.FoodsRepository;
import com.witt.tracker.response.Option;
import com.witt.tracker.response.ReturnCategory;

@Component
public class FoodsDelegate {

	@Autowired
	CategoriesRepository categoriesRepo;
	
	@Autowired
	FoodsRepository foodsRepo;
	
	
	public ReturnCategory[] getAll() {
    	Iterable<Categories> categories = categoriesRepo.findAll();
		List<ReturnCategory> returnCategories = new ArrayList<ReturnCategory>();
    	Iterable<Foods> foods = foodsRepo.findAll();
    	
    	for (Categories category : categories) {
    		ReturnCategory returnCategory = new ReturnCategory();
    		returnCategory.setDisplay(category.getName());
    		returnCategory.setExpected(category.getExpected());
    		returnCategory.setId(category.getId());
    		returnCategory.setTotal(0);
    		returnCategory.setOptions(getOptions(category.getId(), foods));
    		returnCategories.add(returnCategory);
    	}
    	
    	return returnCategories.toArray(new ReturnCategory[returnCategories.size()]);
	}


	private Option[] getOptions(Integer categoryId, Iterable<Foods> foods) {
		List<Option> options = new ArrayList<Option>();
		
		for (Foods food : foods) {
			for (int catId : food.getCategories()) {
				if (catId == categoryId) {
					Option option = new Option();
					option.setCount(0);
					option.setId(food.getId());
					option.setText(food.getText());
					options.add(option);
				}
			}
		}
		
		return options.toArray(new Option[options.size()]);
	}

}
