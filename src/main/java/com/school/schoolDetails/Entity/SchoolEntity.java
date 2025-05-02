package com.school.schoolDetails.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SchoolEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
public int id;
public String name;
public int fees;
SchoolEntity(){}
public SchoolEntity(int id, String name, int fees) {
	this.id = id;
	this.name = name;
	this.fees = fees;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getfees() {
	return fees;
}
public void setfees(int fees) {
	this.fees = fees;
}
@Override
public String toString() {
	return "SchoolEntity [id=" + id + ", name=" + name + ", fees=" + fees + "]";
}

}
