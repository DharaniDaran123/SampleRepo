package com.school.schoolDetails.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.schoolDetails.Entity.SubjectEntity;
@Repository
public interface SubjectRepo extends JpaRepository<SubjectEntity, Integer> {

}
