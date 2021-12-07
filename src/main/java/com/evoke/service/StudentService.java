package com.evoke.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evoke.entity.Department;
import com.evoke.entity.Student;
import com.evoke.repo.DepartmentRepo;
import com.evoke.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo sRepo;
	
	@Autowired
	private DepartmentRepo dRepo;

	public Student save(Student stu) {
		
		Department dept = new Department();
		
		dept.setDeptname("CSC");
		dRepo.save(dept);
		stu.setDept(dept);
		return sRepo.save(stu);
	}

	public Student find(Integer id) {
		return sRepo.findById(id).orElseThrow();
	}
	
}
