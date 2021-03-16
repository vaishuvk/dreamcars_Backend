package com.app.dreamcars.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dreamcars.pojo.*;
import com.app.dreamcars.repository.*;
import com.app.dreamcars.service.DreamcarsService;
@Service
@Transactional
@RestController
@RequestMapping("/cars")
//@CrossOrigin(origins = "http://localhost:4200")

public class DreamcarsController {
		
	@Autowired
	private DreamcarsService dcService;
	
	
	@GetMapping("/getallcars")
	public List<Allcarstable> getAllCars()
	{
		
		return this.dcService.getAllCars();
}
	@PostMapping("/addcars")
	public Allcarstable carsPost(@RequestBody Allcarstable dreamcars)
	{
		return this.dcService.postdreamcars(dreamcars);
	}
	
	@GetMapping("/getallusers")
	public List<usercredentials> getAllUsers()
	{
		
		return this.dcService.getAllUsers();
}
	@PostMapping("/addusers")
	public usercredentials usersPost(@RequestBody usercredentials dreamcars)
	{
		return this.dcService.postusers(dreamcars);
	}
	
	

}
