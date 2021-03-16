package com.app.dreamcars.pojo;
import javax.persistence.*;

@Entity
@Table
public class usercredentials {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int user_id;
	
	@Column(unique=true)
	String user_Name;
	
	@Column(unique=false)
	String password;
	
	
	public usercredentials() {
		// TODO Auto-generated constructor stub
	}


	public usercredentials(int user_id, String user_Name, String password) {
		super();
		this.user_id = user_id;
		this.user_Name = user_Name;
		this.password = password;
		
	}


	public long getId() {
		return user_id;
	}


	public String getuser_Name() {
		return user_Name;
	}

	public void setuser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}
	
	

	@Override
	public String toString() {
		return "usercredentials [id=" + user_id + ", user_Name=" + user_Name + ", password=" + password + "]";
	}
}


