package com.ardatoa.services;

import java.util.List;

import com.ardatoa.dto.DtoEmployee;

public interface IEmployeeService {

	public List<DtoEmployee> findAllEmployees();
	
}
