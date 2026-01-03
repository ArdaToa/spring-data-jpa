package com.ardatoa.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;
import java.util.jar.Attributes.Name;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "birth_of_date", nullable = true)
	private LocalDate birthOfDate;

	@ManyToMany
	@JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "student_id"),
	inverseJoinColumns = @JoinColumn(name = "course_id"))
	private List<Course> courses;
	
}
