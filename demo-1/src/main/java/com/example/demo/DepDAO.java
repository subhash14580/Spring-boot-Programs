package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepDAO extends JpaRepository<Department, Integer>{
		public Department findByManager(String Manager);
}
