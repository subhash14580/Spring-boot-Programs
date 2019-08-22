package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {
	@Id
	private int eid;
	private String name;
	private String designation;
	private int age;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", designation=" + designation + ", age=" + age + "]";
	}


}