package com.witt.tracker.entities;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity (name = "PROGRESS")
public class Progress {

	@Id
	@GeneratedValue
	private Integer id;

	@Column (name = "CATEGORY")
	private int category;

	@Column (name = "ACTUAL")
	private int actual;

	@Column (name = "UPDATED")
	private Date updated;

	@Column (name = "USERID")
	private int userid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getActual() {
		return actual;
	}

	public void setActual(int actual) {
		this.actual = actual;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

}
