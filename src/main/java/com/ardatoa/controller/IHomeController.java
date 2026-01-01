package com.ardatoa.controller;

import com.ardatoa.dto.DtoHome;

public interface IHomeController {

	public DtoHome findHomeById(Long id);
	
}
