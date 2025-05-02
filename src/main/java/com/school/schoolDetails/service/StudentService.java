package com.school.schoolDetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.schoolDetails.Entity.StudentEntitty;
import com.school.schoolDetails.repo.StudentRepo;

@Service
public class StudentService implements StudentServiceInterface{
@Autowired
	private StudentRepo repo;

@Override
public void addDetails(StudentEntitty student) {
	repo.save(student);
}

@Override
public StudentEntitty findStudentById(int id) {
	StudentEntitty student= repo.findById(id).get();
	return student;
}
}
