//package com.app.dreamcars.pojo;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table
//public class Userlikedimages {
//	
//	@Id
//	@Column(unique=true)
//	private int user_id;
//		
//	@Column(unique=true)
//	String car_Name;
//	
//	@Column(unique=false)
//	String car_image_url;
//	
//	
//	public Userlikedimages() {
//		// TODO Auto-generated constructor stub
//	}
//
//
//	public Userlikedimages(int user_id, String car_Name, String car_image_url) {
//		super();
//		this.user_id = user_id;
//		this.car_Name = car_Name;
//		this.car_image_url = car_image_url;
//		
//	}
//
//
//	public long getuser_id() {
//		return user_id;
//	}
//	
//	public void setuser_id(int user_id) {
//		this.user_id = user_id;
//	}
//
//
//	public String getcar_Name() {
//		return car_Name;
//	}
//
//	public void setcar_Name(String car_Name) {
//		this.car_Name = car_Name;
//	}
//
//	public String getcar_image_url() {
//		return car_image_url;
//	}
//
//	public void setcar_image_url(String car_image_url) {
//		this.car_image_url = car_image_url;
//	}
//	
//	
//
//	@Override
//	public String toString() {
//		return "Userlikedimages [user_id=" + user_id + ", car_Name=" + car_Name + ", car_image_url=" + car_image_url + "]";
//	}
//
//}
