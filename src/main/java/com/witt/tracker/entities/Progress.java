package com.witt.tracker.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "PROGRESS")
public class Progress implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column (name = "foodid")
	private int foodid;

	@Column (name = "ACTUAL")
	private Double actual;

	@Column (name = "UPDATED")
	private String updated;

	@Column (name = "USERID")
	private int userid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getFoodid() {
		return foodid;
	}

	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}

	public Double getActual() {
		return actual;
	}

	public void setActual(Double actual) {
		this.actual = actual;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

}
