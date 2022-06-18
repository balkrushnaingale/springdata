package com.infosys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infosys.dto.Employee;
import com.infosys.service.EmployeeServiceImpl;

@SpringBootApplication
public class SpringdataApplication implements CommandLineRunner{
	@Autowired
	EmployeeServiceImpl service;

	public static void main(String[] args) {
		SpringApplication.run(SpringdataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee e=service.findEmp(3);
		System.out.println(e);
	}

}
