package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.demo.modal.Student;

public interface StudentRepository
		extends JpaRepository<Student, String>, JpaSpecificationExecutor<Student> {

}
