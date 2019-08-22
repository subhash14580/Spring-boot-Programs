package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	int deptid;
	private String name;
	private String manager;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String Manager) {
		this.manager = Manager;
	}
	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	
	@Override
	public String toString() {
		return "Department [name=" + name + ", Manager=" + manager + ", deptid=" + deptid + "]";
	}
}
