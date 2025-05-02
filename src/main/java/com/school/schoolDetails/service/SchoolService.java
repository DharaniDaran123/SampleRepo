package com.school.schoolDetails.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.schoolDetails.Entity.SchoolEntity;
import com.school.schoolDetails.repo.schoolrepo;

@Service
public class SchoolService implements SchoolServiceInterface {
	@Autowired
	private schoolrepo repo;

	@Override
	public void addDetails(SchoolEntity school) {
		repo.save(school);
	}

	@Override
	public Optional<SchoolEntity> findSchoolById(int id) {
		Optional<SchoolEntity> response=	repo.findById(id);
		return response;
	}

}
