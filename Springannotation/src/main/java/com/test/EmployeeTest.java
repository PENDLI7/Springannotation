package com.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.EmployeeController;
import com.pojo.Employee;

public class EmployeeTest {

	public static Logger logger= LoggerFactory.getLogger(EmployeeTest.class);
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
		EmployeeController ec = (EmployeeController) ac.getBean("empController");

		Employee employee = new Employee(18, "siva", 50000.00, "siva@siva");
		ec.save(employee);
		System.out.println(employee);
		logger.info("application track{}",employee);

	}

}
