package com.jackyliao.boot.controller;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jackyliao.boot.service.EmployeeService;
import com.jackyliao.boot.vo.Employee;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "員工管理")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	@ApiOperation(value = "取得所有員工")
	public List<Employee> findAll() {
		return employeeService.findAll();
	}
	
	@GetMapping("/employee/{id}")
	@ApiOperation(value = "查詢員工詳情")
	public Employee findById(@PathVariable("id") Long id) {
		return employeeService.findById(id);
	}
	
	@PostMapping("/employee")
	@ApiOperation(value = "新增員工")
	public void insert(@RequestBody Employee employee) {
		employeeService.insert(employee);
	}
	
	@PutMapping("/employee/{id}")
	@ApiOperation(value = "修改員工資料")
	public void update(
			@PathVariable Long id,@RequestBody Employee employee) {
		employee.setId(id);
		employeeService.update(employee);
	}
	
	@Delete("/employee/{id}")
	@ApiOperation(value = "刪除員工")
	public void delete(@PathVariable Long id) {
		employeeService.delete(id);
	}

}
