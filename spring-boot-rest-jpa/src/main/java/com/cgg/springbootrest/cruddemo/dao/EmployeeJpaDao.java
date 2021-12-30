package com.cgg.springbootrest.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cgg.springbootrest.cruddemo.entity.Employee;

public interface EmployeeJpaDao extends JpaRepository<Employee, Integer>{
	
}
