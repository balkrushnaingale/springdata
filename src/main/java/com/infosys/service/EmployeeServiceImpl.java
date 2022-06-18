package com.infosys.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.dto.Employee;
import com.infosys.repository.EmployeeImp;
@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeService{
	@Autowired
	EmployeeImp empDao;
	@Override
	public Employee findEmp(int eno) {
		Employee e=empDao.findEmp(eno);
		return e;
	}
	

}
