package com.witt.tracker.request;

import java.sql.Date;

import com.witt.tracker.response.ReturnCategory;

public class ProgressRequest {
	private ReturnCategory[] foods;
	private Date updated;
	
	private Integer userId;

	public ReturnCategory[] getFoods() {
		return foods;
	}

	public void setFoods(ReturnCategory[] foods) {
		this.foods = foods;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
}
