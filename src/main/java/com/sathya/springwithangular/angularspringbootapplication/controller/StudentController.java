package com.sathya.springwithangular.angularspringbootapplication.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.springwithangular.angularspringbootapplication.bean.Student;
import com.sathya.springwithangular.angularspringbootapplication.repository.StudentRepository;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;

	@GetMapping(value = "/users")
	public List<Student> getStudents() {
		return (List<Student>) studentRepository.findAll();
	}

	@PostMapping(value = "/users")
	public void adduser(@RequestBody Student student) {
		studentRepository.save(student);
	}

	@GetMapping(value = "/users/{id}")
	public Optional<Student> getUserById(@PathVariable long id) {
		return studentRepository.findById(id);
	}

	@DeleteMapping(value = "/users/{id}")
	public void deleteUserById(@PathVariable long id) {
		studentRepository.deleteById(id);
	}

	@PutMapping(value = "/users")
	public Student deleteUserById(@RequestBody Student student) {
		return studentRepository.save(student);
	}
}
