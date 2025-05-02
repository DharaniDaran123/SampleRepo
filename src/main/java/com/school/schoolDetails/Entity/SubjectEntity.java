package com.school.schoolDetails.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SubjectEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
public int sub_id;
public String sub_name;
SubjectEntity(){}
public SubjectEntity(int sub_id, String sub_name) {
	this.sub_id = sub_id;
	this.sub_name = sub_name;
}
public int getSub_id() {
	return sub_id;
}
public void setSub_id(int sub_id) {
	this.sub_id = sub_id;
}
public String getSub_name() {
	return sub_name;
}
public void setSub_name(String sub_name) {
	this.sub_name = sub_name;
}
@Override
public String toString() {
	return "SubjectEntity [sub_id=" + sub_id + ", sub_name=" + sub_name + "]";
}

}
