package com.witt.tracker.request;

import java.sql.Date;

import com.witt.tracker.response.ReturnCategory;

public class ProgressRequest {
	private ReturnCategory[] foods;
	private String updated;
	
	private Integer userId;

	public ReturnCategory[] getFoods() {
		return foods;
	}

	public void setFoods(ReturnCategory[] foods) {
		this.foods = foods;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
}
