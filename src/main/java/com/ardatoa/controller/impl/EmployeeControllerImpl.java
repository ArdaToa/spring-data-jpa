package com.ardatoa.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ardatoa.controller.IEmployeeController;
import com.ardatoa.dto.DtoEmployee;
import com.ardatoa.services.IEmployeeService;

@RestController
@RequestMapping("rest/api/employee")
public class EmployeeControllerImpl implements IEmployeeController{
	
	@Autowired
	private IEmployeeService employeeService;

	@GetMapping(path = "/list")
	@Override
	public List<DtoEmployee> findAllEmployees() {
		return employeeService.findAllEmployees();
	}

}
