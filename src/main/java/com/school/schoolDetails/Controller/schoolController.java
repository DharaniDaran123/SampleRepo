package com.school.schoolDetails.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.schoolDetails.Entity.SchoolEntity;
import com.school.schoolDetails.service.SchoolServiceInterface;

@RestController
@RequestMapping("/school")
public class schoolController {
	@Autowired
	private SchoolServiceInterface schoolServiceInterface;
	@PostMapping("/add")
	public String addDetails(@RequestBody SchoolEntity school) 
	{
		schoolServiceInterface.addDetails(school);
		return "Added sucessfully";
	}
	@GetMapping("/get/{id}")
public Optional<SchoolEntity> findSchoolById(@RequestParam int id) 
	{
		Optional<SchoolEntity> response=	schoolServiceInterface.findSchoolById(id);
		return response;
	}
}
