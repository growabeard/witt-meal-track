package com.witt.tracker.delegate;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.witt.tracker.entities.Category;
import com.witt.tracker.entities.Foods;
import com.witt.tracker.entities.Progress;
import com.witt.tracker.repositories.CategoriesRepository;
import com.witt.tracker.repositories.FoodsRepository;
import com.witt.tracker.repositories.ProgressRepository;
import com.witt.tracker.response.Option;
import com.witt.tracker.response.ReturnCategory;

@Component
public class FoodsDelegate {

	@Autowired
	CategoriesRepository categoriesRepo;
	
	@Autowired
	FoodsRepository foodsRepo;
	
	@Autowired
	ProgressRepository progressRepo;
	
	
	public ReturnCategory[] getAll(String date) {
    	Iterable<Category> categories = categoriesRepo.findAll();
		List<ReturnCategory> returnCategories = new ArrayList<ReturnCategory>();
    	Iterable<Foods> foods = foodsRepo.findAll();
   		Iterable<Progress> progress = progressRepo.getMatchingDate(date);
    	
    	for (Category category : categories) {
    		ReturnCategory returnCategory = new ReturnCategory();
    		returnCategory.setDisplay(category.getName());
    		returnCategory.setExpected(category.getExpected());
    		returnCategory.setId(category.getId());
    		returnCategory.setTotal(0);
    		returnCategory.setOptions(getOptions(category.getId(), foods, progress));
    		returnCategories.add(returnCategory);
    	}
    	
    	return returnCategories.toArray(new ReturnCategory[returnCategories.size()]);
	}


	private Option[] getOptions(Integer categoryId, Iterable<Foods> foods, 
			Iterable<Progress> progress) {
		List<Option> options = new ArrayList<Option>();
		
		for (Foods food : foods) {
			for (Integer catId : food.getCategories()) {
				if (catId.compareTo(categoryId) == 0) {
					Option option = createOption(food, progress);
					options.add(option);
				}
			}
		}
		
		return options.toArray(new Option[options.size()]);
	}


	private Option createOption(Foods food, Iterable<Progress> progress) {
		Option option = new Option();
		option.setCount(0);
		for (Progress prog : progress) {
			if (prog.getFoodid() == food.getId()) {
				option.setCount(prog.getActual());
			}
		}
		option.setId(food.getId());
		option.setText(food.getText());
		return option;
	}

}
