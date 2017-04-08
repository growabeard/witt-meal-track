package com.witt.tracker.delegate;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.witt.tracker.entities.Progress;
import com.witt.tracker.repositories.ProgressRepository;
import com.witt.tracker.request.ProgressRequest;
import com.witt.tracker.response.Option;
import com.witt.tracker.response.ReturnCategory;

@Component
public class ProgressDelegate {
	
	@Autowired
	ProgressRepository progressRepo;

	public void save(ProgressRequest request) {
		for(ReturnCategory category : request.getFoods()) {
			for(Option option : category.getOptions()) {
				if (option.getCount() > 0) {
					progressRepo.save(createNewProgress(option, category,
							request.getUserId(), request.getUpdated()));
				}
			}
		}
	}

	private Progress createNewProgress(Option option, ReturnCategory category, 
			Integer userId, String updated) {
		Progress prog = new Progress();
		prog.setActual(option.getCount());
		prog.setFoodid(category.getId());
		prog.setId(option.getId());
		prog.setUserid(userId);
		prog.setUpdated(updated);
		return prog;
	}

}
