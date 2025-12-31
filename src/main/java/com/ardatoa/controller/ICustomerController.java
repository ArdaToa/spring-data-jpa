package com.ardatoa.controller;

import com.ardatoa.dto.DtoCustomer;

public interface ICustomerController {

	public DtoCustomer findCustomerById(Long id);
	
}
