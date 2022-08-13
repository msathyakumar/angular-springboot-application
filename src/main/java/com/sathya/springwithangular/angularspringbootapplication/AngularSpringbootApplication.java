package com.sathya.springwithangular.angularspringbootapplication;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.sathya.springwithangular.angularspringbootapplication.bean.Student;
import com.sathya.springwithangular.angularspringbootapplication.repository.StudentRepository;

@SpringBootApplication
@EnableEurekaClient
public class AngularSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularSpringbootApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(StudentRepository studentRepository) {
		return args ->{
			Stream.of("sathya","kumar","reddy").forEach(name->{
				Student student =new Student(name,22,"male",name+"@gmail.com","kec");
				studentRepository.save(student);
			});
			studentRepository.findAll().forEach(System.out::print);
		};
	}

}
