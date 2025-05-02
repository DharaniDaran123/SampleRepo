package com.school.schoolDetails.service;

import java.util.Optional;

import com.school.schoolDetails.Entity.SchoolEntity;

public interface SchoolServiceInterface {

	void addDetails(SchoolEntity school);

	 Optional<SchoolEntity> findSchoolById(int id);

}
