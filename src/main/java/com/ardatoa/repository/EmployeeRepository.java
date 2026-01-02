package com.ardatoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ardatoa.entites.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	
	
}
