package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pojo.Employee;
import com.service.EmployeeService;
@Controller("empController")
public class EmployeeController {
	@Autowired
	EmployeeService empService;
	public void save(Employee employee) {
		System.out.println("EmployeeController Save method");
		empService.save(employee);
	}

}
