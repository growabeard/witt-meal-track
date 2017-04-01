package com.witt.tracker.entities;



import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;



@Entity (name = "FOODS")

public class Foods {



	@Id

	@GeneratedValue

	private Integer id;

	

	@Column (name = "TEXT")

	private String text;

	

	@Column (name = "CATEGORIES")

	private int[] categories;



	public Integer getId() {

		return id;

	}



	public void setId(Integer id) {

		this.id = id;

	}



	public String getText() {

		return text;

	}



	public void setText(String text) {

		this.text = text;

	}



	public int[] getCategories() {

		return categories;

	}



	public void setCategories(int[] categories) {

		this.categories = categories;

	}

}

