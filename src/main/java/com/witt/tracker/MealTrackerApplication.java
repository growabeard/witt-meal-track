package com.witt.tracker;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.witt.tracker.delegate.FoodsDelegate;
import com.witt.tracker.delegate.ProgressDelegate;
import com.witt.tracker.request.ProgressRequest;
import com.witt.tracker.response.ReturnCategory;

@SpringBootApplication
@Controller
public class MealTrackerApplication {
	
	@Autowired
	FoodsDelegate foodsDelegate;
	
	@Autowired
	ProgressDelegate progressDelegate;
	
	@RequestMapping("/foodlist")
    @ResponseBody
    ResponseEntity<ReturnCategory[]> foodListEnpoint(@RequestParam(value="date") Date date) {
    	ReturnCategory[] returnFoods = foodsDelegate.getAll(date);
    	return new ResponseEntity<ReturnCategory[]>(returnFoods, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    ResponseEntity saveEndpoint(@RequestBody ProgressRequest request) {
    	progressDelegate.save(request);
    	return new ResponseEntity<>(HttpStatus.OK);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(MealTrackerApplication.class, args);
	}
}
