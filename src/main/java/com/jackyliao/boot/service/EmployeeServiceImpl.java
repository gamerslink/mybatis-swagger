package com.jackyliao.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jackyliao.boot.mapper.EmployeeMapperImpl;
import com.jackyliao.boot.vo.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeMapperImpl employeeMapperImpl;
	
	@Override
	public List<Employee> findAll() {
		return employeeMapperImpl.findAll();
	}

	@Override
	public Employee findById(Long id) {
		return employeeMapperImpl.findById(id);
	}

	@Override
	public void insert(Employee employee) {
		employeeMapperImpl.insert(employee);
	}

	@Override
	public void update(Employee employee) {
		employeeMapperImpl.update(employee);
	}

	@Override
	public void delete(Long id) {
		employeeMapperImpl.delete(id);
	}

}
