package com.witt.tracker.entities;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Type;


@Entity (name = "FOODS")
public class Foods implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;

	@Column (name = "TEXT")
	private String text;

	@Column(name = "CATEGORIES", columnDefinition = "integer[]")
    @Type(type = "com.witt.tracker.usertypes.IntArrayUserType")
	private Integer[] categories;

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

	public Integer[] getCategories() {
		return categories;
	}

	public void setCategories(Integer[] categories) {
		this.categories = categories;
	}

}

