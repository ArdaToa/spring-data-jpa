package com.ardatoa.controller;

import java.util.List;

import com.ardatoa.dto.DtoStudent;
import com.ardatoa.dto.DtoStudentIU;
import com.ardatoa.entites.Student;

public interface IStudentController {
	
	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
	
	
}
