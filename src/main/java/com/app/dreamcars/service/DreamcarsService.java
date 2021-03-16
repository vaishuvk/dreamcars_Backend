package com.app.dreamcars.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dreamcars.pojo.Allcarstable;
import com.app.dreamcars.pojo.usercredentials;
import com.app.dreamcars.repository.DreamcarsRepository;
import com.app.dreamcars.repository.UsercredentialRepository;
public interface DreamcarsService {
	
	Allcarstable createdreamcars(Allcarstable dreamcars);
	List<Allcarstable> getAllCars();
	Allcarstable postdreamcars(Allcarstable dreamcars);

	usercredentials createusers(usercredentials dreamcars);
	List<usercredentials> getAllUsers();
	usercredentials postusers(usercredentials dreamcars);

}
