package com.sathya.springwithangular.angularspringbootapplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.sathya.springwithangular.angularspringbootapplication.bean.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
