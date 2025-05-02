package com.school.schoolDetails.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntitty {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int stud_id;
	public String stud_name;
	public int stud_class;
	StudentEntitty(){}
	public StudentEntitty(int stud_id, String stud_name, int stud_class) {
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.stud_class = stud_class;
	}
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public int getStud_class() {
		return stud_class;
	}
	public void setStud_class(int stud_class) {
		this.stud_class = stud_class;
	}
	@Override
	public String toString() {
		return "StudentEntitty [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stud_class=" + stud_class + "]";
	}
	
}
