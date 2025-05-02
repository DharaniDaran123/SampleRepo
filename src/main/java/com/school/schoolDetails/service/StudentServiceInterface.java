package com.school.schoolDetails.service;

import com.school.schoolDetails.Entity.StudentEntitty;

public interface StudentServiceInterface {

	void addDetails(StudentEntitty student);

	StudentEntitty findStudentById(int id);

}
