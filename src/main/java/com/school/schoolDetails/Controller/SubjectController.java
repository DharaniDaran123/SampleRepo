package com.school.schoolDetails.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.schoolDetails.Entity.SubjectEntity;
import com.school.schoolDetails.service.SubjectInterface;

@RestController
@RequestMapping("/sub")
public class SubjectController {
@Autowired
private SubjectInterface subjectInterface;
@PostMapping("/add")
public String addSubject(@RequestBody SubjectEntity subjectEntity) 
{
	subjectInterface.addSubject(subjectEntity);
	return "sub added sucessflly";
}
@GetMapping("/get/{id}")
public SubjectEntity getSubjectById(@PathVariable int id) 
{
	SubjectEntity response=	subjectInterface.getSubjectById(id);
	return response;
}
}
