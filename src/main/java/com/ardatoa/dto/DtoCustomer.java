package com.ardatoa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoCustomer {
	
	private Long id;
	
	private String name;
	
	private DtoAddress address;
	
	
	
}
