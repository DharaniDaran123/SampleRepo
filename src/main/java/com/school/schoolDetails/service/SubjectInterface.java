package com.school.schoolDetails.service;

import com.school.schoolDetails.Entity.SubjectEntity;

public interface SubjectInterface {

	void addSubject(SubjectEntity subjectEntity);

	SubjectEntity getSubjectById(int id);

}
