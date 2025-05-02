package com.school.schoolDetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.schoolDetails.Entity.SubjectEntity;
import com.school.schoolDetails.repo.SubjectRepo;

@Service
public class SubjectService implements SubjectInterface {
	@Autowired
	private SubjectRepo repo;
	@Override
	public void addSubject(SubjectEntity subjectEntity) {
repo.save(subjectEntity)	;	
	}

	@Override
	public SubjectEntity getSubjectById(int id) {
		SubjectEntity response=	repo.findById(id).get();
		return response;
	}

}
