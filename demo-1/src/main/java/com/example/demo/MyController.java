package com.example.demo;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
		@Autowired
		 EmpDAO dao;
		
		@Autowired
		DepDAO deptDao;
		
		@RequestMapping("/")
		public String welcome() {
			return "welcome.jsp";
		}
		
		@RequestMapping(value="/displayAl",produces = {"application/xml","application/json"})
		@ResponseBody
		
		public String displayAllEmployee(){
			return dao.findAll().toString();
		}
		
		@RequestMapping(value="/displayAll")
		@ResponseBody
		public List<Employee> displayAllEmployees(@RequestParam String designation){
			return dao.getEmployeeInSortedByAge(designation);
		}
		@RequestMapping("/displayByDesignation")
		@ResponseBody
		public String displayByDesignation(@RequestParam String designation) {
			return dao.findByDesignation(designation).toString();
		}
		
		@RequestMapping("/insertData")
		@ResponseBody
		public String insertTheRecorsInDB(Employee e) {
			dao.save(e);
			return "successfully inserted the records";
		}
		
		
		@RequestMapping("/collect")
		@ResponseBody
		public String deptDemo(@RequestParam int eid,@RequestParam String manager) {
			System.out.println("subhash::: " + eid+ " "+manager);
			Employee e = dao.findById(eid).orElse(new Employee());
			Department d = deptDao.findByManager(manager);
			System.out.println(e.toString() + " "+d.toString());
			return e.toString() + d.toString();
		}
}
