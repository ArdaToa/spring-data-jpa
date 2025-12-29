package com.ardatoa.services;

import java.util.List;

import com.ardatoa.dto.DtoStudent;
import com.ardatoa.dto.DtoStudentIU;
import com.ardatoa.entites.Student;

public interface IStudentServic {

	public DtoStudent saveStudent(DtoStudentIU student);
	
	public List<DtoStudent> getallStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
	
	
	
}
