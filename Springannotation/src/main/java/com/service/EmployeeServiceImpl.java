package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDao;
import com.pojo.Employee;
@Service("empServImpl")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao dao;
	public void save(Employee employee) {
		System.out.println("EmployeeServiceImpl Save Method");
		dao.save(employee);
		
	}

}
