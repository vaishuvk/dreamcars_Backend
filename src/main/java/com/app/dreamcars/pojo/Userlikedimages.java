package com.app.dreamcars.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Userlikedimages {
	
	@Id
	@Column(unique=true)
	private int user_id;
	
	
	@Column(unique=true)
	private int car_id;
	
	@Column(unique=false)
	String car_image_url;
	
	
	public Userlikedimages() {
		// TODO Auto-generated constructor stub
	}


	public Userlikedimages(int user_id, int car_id, String car_image_url) {
		super();
		this.user_id = user_id;
		this.car_id = car_id;
		this.car_image_url = car_image_url;
		
	}


	public long getuser_id() {
		return user_id;
	}
	
	public void setuser_id(int user_id) {
		this.user_id = user_id;
	}


	public long getcar_id() {
		return car_id;
	}

	public void setcar_id(int car_id) {
		this.car_id = car_id;
	}

	public String getcar_image_url() {
		return car_image_url;
	}

	public void setcar_image_url(String car_image_url) {
		this.car_image_url = car_image_url;
	}
	
	

	@Override
	public String toString() {
		return "Userlikedimages [user_id=" + user_id + ", car_id=" + car_id + ", car_image_url=" + car_image_url + "]";
	}

}
