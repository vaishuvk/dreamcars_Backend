package com.app.dreamcars.pojo;
import javax.persistence.*;

@Entity
@Table
public class Allcarstable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int car_id;
	
	@Column(unique=true)
	String car_Name;
	
	@Column(unique=false)
	String manufacturer;
	
	@Column(unique=true)
	String car_image_url;
	
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
