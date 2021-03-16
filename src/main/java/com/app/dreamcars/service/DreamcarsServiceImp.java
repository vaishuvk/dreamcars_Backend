package com.app.dreamcars.service;
import java.util.*;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dreamcars.pojo.Allcarstable;
import com.app.dreamcars.pojo.usercredentials;
import com.app.dreamcars.repository.DreamcarsRepository;
import com.app.dreamcars.repository.UsercredentialRepository;
@Service
@Transactional
public class DreamcarsServiceImp implements DreamcarsService{
	@Autowired
	private DreamcarsRepository dreamcarsrepository;
	
	@Override
	public Allcarstable createdreamcars(Allcarstable dreamcars) {
		// TODO Auto-generated method stub
		return dreamcarsrepository.save(dreamcars);
	}


	@Override
	public List<Allcarstable> getAllCars() {
		// TODO Auto-generated method stub
		return dreamcarsrepository.findAll();
	}


	@Override
	public Allcarstable postdreamcars(Allcarstable dreamcars) {
		// TODO Auto-generated method stub
		return dreamcarsrepository.save(dreamcars);
	}
	
	@Autowired
	private UsercredentialRepository userrepository;
	
	@Override
	public usercredentials createusers(usercredentials dreamcars) {
		// TODO Auto-generated method stub
		return userrepository.save(dreamcars);
	}


	@Override
	public List<usercredentials> getAllUsers() {
		// TODO Auto-generated method stub
		return userrepository.findAll();
	}


	@Override
	public usercredentials postusers(usercredentials dreamcars) {
		// TODO Auto-generated method stub
		return userrepository.save(dreamcars);
	}


}
