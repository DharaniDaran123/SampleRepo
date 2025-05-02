package com.school.schoolDetails.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.schoolDetails.Entity.StudentEntitty;
@Repository
public interface StudentRepo extends JpaRepository<StudentEntitty, Integer>{

}
