package com.ardatoa.services;

import com.ardatoa.dto.DtoCustomer;

public interface ICustomerService {

	public DtoCustomer findCustomerById(Long id);
	
}
