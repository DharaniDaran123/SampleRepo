package com.school.schoolDetails.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.schoolDetails.Entity.SchoolEntity;
@Repository
public interface schoolrepo extends JpaRepository<SchoolEntity, Integer>{

}
