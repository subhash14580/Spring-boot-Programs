package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest")
public class MyController {
	@RequestMapping("/employee/{id}")
	@ResponseBody
	public Employee getEmployee(@PathVariable int id) {
		
		Employee e =  new Employee();
		e.setEid(id);
		return e;
	}
}
