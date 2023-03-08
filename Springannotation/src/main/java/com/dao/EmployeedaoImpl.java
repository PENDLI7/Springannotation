package com.dao;

import org.springframework.stereotype.Repository;

import com.pojo.Employee;
@Repository("empDaoImpl")
public class EmployeedaoImpl implements EmployeeDao {

	public void save(Employee employee) {
		System.out.println("EmployeedaoImpl Save method....");
		
	}

}
