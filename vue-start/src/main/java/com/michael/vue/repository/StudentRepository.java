package com.michael.vue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.michael.vue.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
