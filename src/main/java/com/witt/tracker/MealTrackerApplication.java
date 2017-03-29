package com.witt.tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.witt.tracker.delegate.FoodsDelegate;
import com.witt.tracker.response.ReturnCategory;

@SpringBootApplication
@Controller
public class MealTrackerApplication {
	
	@Autowired
	FoodsDelegate delegate;
	
	@RequestMapping("/foodlist")
    @ResponseBody
    ResponseEntity<ReturnCategory[]> foodListEnpoint() {
    	ReturnCategory[] returnFoods = delegate.getAll();
    	return new ResponseEntity<ReturnCategory[]>(returnFoods, HttpStatus.OK);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(MealTrackerApplication.class, args);
	}
}
