package com.danish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.danish.entity.Student;
import com.danish.services.StudentServices;

@RestController
public class StudentController {

	@Autowired
	StudentServices studentServices;

	@PostMapping("save")
	public Student saveRecord(@RequestBody Student student) {
		return studentServices.saveStudent(student);
	}

}
