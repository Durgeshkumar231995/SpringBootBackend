package com.java.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.java.in.entity.Student;

import java.util.List;
@RepositoryRestResource(collectionResourceRel = "student-api",path = "student-api")
public interface StudentRepository extends JpaRepository<Student,Integer> {

     List<Student> findBySection(String section);
}
