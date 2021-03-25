package com.app.dreamcars.pojo;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
//@IdClass(AllcarstableId.class)
@Entity
@Table
//public class Allcarstable implements Serializable{
public class Allcarstable {
	
	@Column(unique=true)
	private int car_id;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	String car_Name;
	
	@Column(unique=false)
	String manufacturer;
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	String car_image_url;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "users")
	private Set<usercredentials> cars = new HashSet();
	
	public Allcarstable() {
		// TODO Auto-generated constructor stub
	}


	public Allcarstable(int car_id, String car_Name, String manufacturer, String car_image_url) {
		super();
		this.car_id = car_id;
		this.car_Name = car_Name;
		this.manufacturer = manufacturer;
		this.car_image_url = car_image_url;
	}


	public long getId() {
		return car_id;
	}


	public String getcar_Name() {
		return car_Name;
	}

	public void setcar_Name(String car_Name) {
		this.car_Name = car_Name;
	}

	public String getmanufacturer() {
		return manufacturer;
	}

	public void setmanufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getcar_image_url() {
		return car_image_url;
	}

	public void setcar_image_url(String car_image_url) {
		this.car_image_url = car_image_url;
	}

	@Override
	public String toString() {
		return "Allcarstable [id=" + car_id + ", car_Name=" + car_Name + ", car_image_url=" + car_image_url + ", manufacturer=" + manufacturer + "]";
	}
}
