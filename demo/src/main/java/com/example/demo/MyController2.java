package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MyController2 {
	@Autowired
	 EmpDAO dao;

		@PostMapping("/employee")
		public String insertEmp(Employee e) {
			System.out.println("employee "+e.toString());
			dao.save(e);
			return "success";
		}
		
		@PostMapping
		public String deleteEmp(Employee ee) {
			dao.delete(ee);
			return "success";
		}
		
		@GetMapping(path="/displayAl",produces = "application/xml")

		public List<Employee> displayAllEmployee(){
			return dao.findAll();
		}
}
