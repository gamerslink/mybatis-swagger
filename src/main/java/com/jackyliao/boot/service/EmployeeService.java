package com.jackyliao.boot.service;

import java.util.List;

import com.jackyliao.boot.vo.Employee;

public interface EmployeeService {
	
	List<Employee> findAll();
	
	Employee findById(Long id);
	
	void insert(Employee employee);
	
	void update(Employee employee);
	
	void delete(Long id);

}
