package com.witt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.witt.response.Foods;

@SpringBootApplication
@Controller
public class MealTrackerApplication {
	
	@RequestMapping("/foodlist")
    @ResponseBody
    ResponseEntity<Foods> home() {
      return new ResponseEntity<Foods>(new Foods(), HttpStatus.OK);
    }

	public static void main(String[] args) {
		SpringApplication.run(MealTrackerApplication.class, args);
	}
}
