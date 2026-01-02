package com.ardatoa.controller;

import java.util.List;

import com.ardatoa.dto.DtoEmployee;

public interface IEmployeeController {

	public List<DtoEmployee> findAllEmployees();
	
}
