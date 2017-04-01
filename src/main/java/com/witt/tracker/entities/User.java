package com.witt.tracker.entities;



import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;



@Entity (name = "USER")

public class User {



	@Id

	@GeneratedValue

	private Integer id;

	

	@Column (name = "FIRST")

	private String first;

	

	@Column (name = "LAST")

	private String last;

	

	@Column (name = "NICKNAME")

	private String nickname;



	public Integer getId() {

		return id;

	}



	public void setId(Integer id) {

		this.id = id;

	}



	public String getFirst() {

		return first;

	}



	public void setFirst(String first) {

		this.first = first;

	}



	public String getLast() {

		return last;

	}



	public void setLast(String last) {

		this.last = last;

	}



	public String getNickname() {

		return nickname;

	}



	public void setNickname(String nickname) {

		this.nickname = nickname;

	}

	

}

