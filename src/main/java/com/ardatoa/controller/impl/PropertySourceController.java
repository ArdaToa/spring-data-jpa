package com.ardatoa.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ardatoa.configuration.DataSource;
import com.ardatoa.configuration.GlobalProperties;

@RestController
@RequestMapping("rest/api/property")
public class PropertySourceController {
	
	@Autowired
	private GlobalProperties globalProperties;

	@GetMapping("/datasource")
	public DataSource getDataSource() {
		
		DataSource dataSource = new DataSource();
		dataSource.setUrl(globalProperties.getUrl());
		dataSource.setUsername(globalProperties.getUsername());
		dataSource.setPassword(globalProperties.getPassword());
		
		return dataSource;
	}
	
}
