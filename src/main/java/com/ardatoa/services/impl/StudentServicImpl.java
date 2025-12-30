package com.ardatoa.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ardatoa.dto.DtoStudent;
import com.ardatoa.dto.DtoStudentIU;
import com.ardatoa.entites.Student;
import com.ardatoa.repository.StudentRepository;
import com.ardatoa.services.IStudentServic;

@Service
public class StudentServicImpl implements IStudentServic{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {
		DtoStudent response = new DtoStudent();
		Student student = new Student();
		BeanUtils.copyProperties(dtoStudentIU, student);
		Student dbStudent = studentRepository.save(student);
		BeanUtils.copyProperties(dbStudent, response);
		return response;

	}

	@Override
	public List<DtoStudent> getallStudents() {
		List<DtoStudent> dtoList = new ArrayList<>();
		
		List<Student> studentList = studentRepository.findAllStudents();
		for (Student student : studentList) {
			DtoStudent dto = new DtoStudent();
			BeanUtils.copyProperties(student, dto);
			dtoList.add(dto);
		}
		return dtoList;
	}

	@Override
	public DtoStudent getStudentById(Integer id) {
		DtoStudent dto = new DtoStudent(); 
		Optional<Student> optional = studentRepository.findStudentById(id);
		if(optional.isPresent()) {
			Student dbStudent = optional.get();
			BeanUtils.copyProperties(dbStudent, dto);
		}
		return dto;
	}

	@Override
	public void deleteStudent(Integer id) {
	Optional<Student> optional = studentRepository.findById(id);
	if(optional.isPresent()){
		studentRepository.delete(optional.get());
	 }
	}

	@Override
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU) {
		DtoStudent dto = new DtoStudent();
		
		Optional<Student> optional = studentRepository.findById(id);
		if(optional.isPresent()){
			Student dbStudent = optional.get();
			
			dbStudent.setFirstName(dtoStudentIU.getFirstName());
			dbStudent.setLastName(dtoStudentIU.getLastName());
			dbStudent.setBirthOfDate(dtoStudentIU.getBirthOfDate());
			
			Student updateStudent = studentRepository.save(dbStudent);
			
			BeanUtils.copyProperties(updateStudent, dto);
			return dto;
		}
		
		return null;

	}

}
