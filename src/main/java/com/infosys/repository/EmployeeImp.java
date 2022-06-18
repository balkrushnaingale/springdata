package com.infosys.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.infosys.dto.Employee;
@Repository
public  class EmployeeImp implements IEmployee{

	@PersistenceContext
	EntityManager em;
	@Override
public Employee findEmp(int eno) {
	//em.getTransaction().begin();
		Employee e=em.find(Employee.class,eno);
	//em.getTransaction().commit();
		return e;
	}

	
}
