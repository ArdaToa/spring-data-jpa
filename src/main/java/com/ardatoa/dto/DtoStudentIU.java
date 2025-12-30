package com.ardatoa.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {
	
	
	@NotEmpty(message = "First Name Alanı Boş Bırakılamaz!")
	@Min(value = 3)
	@Max(value = 10 , message = "Max 10 karakter olmalıdır.")
	private String firstName;
	
	@Size(min = 3, max = 30)
	private String lastName;
	
	private LocalDate birthOfDate;
	
}
