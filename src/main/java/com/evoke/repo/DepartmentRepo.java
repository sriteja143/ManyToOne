package com.evoke.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evoke.entity.Department;
import com.evoke.entity.Student;

public interface DepartmentRepo extends JpaRepository<Department, Integer>{

}
