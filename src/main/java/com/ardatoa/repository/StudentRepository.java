package com.ardatoa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ardatoa.entites.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	
	//HQL : Sınıf ismi ve değişken isimleri kullanılarak sorgular yazılır.   (false)
	//SQL : Tablo ismi ve tablo içerisindeki kolon isimleri ile sorgu yazılır.    (true)
	
	@Query(value = "from Student", nativeQuery = false)         //(true yazarsak "select *  from student.student" >> olarak değiştirmemiz lazım)
	List<Student> findAllStudents();
	
	@Query(value = "from Student s WHERE s.id = :studentId")
	Optional<Student> findStudentById(Integer studentId);

}
