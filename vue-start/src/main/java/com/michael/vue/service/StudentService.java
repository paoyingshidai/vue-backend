package com.michael.vue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michael.vue.entity.Student;
import com.michael.vue.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;
	
	public Student findOneById(Integer id) {
		return repository.findOne(id);
	}
	
//	public Optional<Student> findOnById(Integer id) {
//		return repository.findById(id);
//	}
	
	public List<Student> findAll() {
		return repository.findAll();
	}
	
}
