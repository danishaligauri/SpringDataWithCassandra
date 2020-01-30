package com.danish.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danish.entity.Student;
import com.danish.repository.StudentRepository;

@Service
public class StudentServices {

	@Autowired
	StudentRepository stuRepo;

	public Student saveStudent(Student student) {
		stuRepo.save(student);
		return student;
	}
}
