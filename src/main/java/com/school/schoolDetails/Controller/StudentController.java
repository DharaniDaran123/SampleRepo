package com.school.schoolDetails.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.schoolDetails.Entity.StudentEntitty;
import com.school.schoolDetails.service.StudentServiceInterface;

@RestController
@RequestMapping("student")
public class StudentController {
@Autowired
	private StudentServiceInterface studentServiceInterface;

@PostMapping("/add")
public String addDetails(@RequestBody StudentEntitty student) 
{
	studentServiceInterface.addDetails(student);
	return "Added sucessfully";
}
@GetMapping("/get/{id}")
public StudentEntitty findStudentById(@RequestParam int id) 
{
	StudentEntitty response=	studentServiceInterface.findStudentById(id);
	return response;
}
}
