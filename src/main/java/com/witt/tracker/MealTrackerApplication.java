package com.witt.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.witt.tracker.response.Foods;
import com.witt.tracker.response.Option;

@SpringBootApplication
@Controller
public class MealTrackerApplication {
	
	@RequestMapping("/foodlist")
    @ResponseBody
    ResponseEntity<Foods[]> foodListEnpoint() {
    	Foods proteins = new Foods();
    	proteins.setDisplay("Proteins");
    	proteins.setExpected(3);
    	proteins.setId(1);
    	proteins.setTotal(0);
    	Option option = new Option();
    	option.setCount(0);
    	option.setId(1);
    	option.setText("1 cup broccoli");
		proteins.setOptions(new Option[]{option});
    	Foods leafy = new Foods();
    	leafy.setDisplay("Leafy Greens and stuff");
    	leafy.setOptions(new Option[]{option});
    	leafy.setId(2);
    	leafy.setExpected(3);
    	leafy.setTotal(0);
    	Foods[] returnFoods = new Foods[]{proteins, leafy};
    	return new ResponseEntity<Foods[]>(returnFoods, HttpStatus.OK);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(MealTrackerApplication.class, args);
	}
}
