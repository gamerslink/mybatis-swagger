package com.jackyliao.boot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jackyliao.boot.vo.Employee;

@Mapper
public interface EmployeeMapperImpl {
	
	@Select("SELECT * FROM employee")
	List<Employee> findAll();
	
	@Select("SELECT * FROM employee WHERE id = #{id}")
	Employee findById(Long id);
	
	
	@Insert("INSERT INTO employee"
			+ "(empNo, eName, job, hireadete, sal, comm) "
			+ "VALUES"
			+ "(#{empNo}, #{eName}, #{job}, #{hireadete}, #{sal}, #{comm})")
	void insert(Employee employee);
	
	
	@Update("UPDATE employee "
			+ "SET "
			+ "empNo=#{empNo}, eName=#{eName}, job=#{job}, hiredeate=#{hireadete}, sal=#{sal}, comm=#{comm}")
	void update(Employee employee);
	
	@Delete("DELETE FROM employee WHERE id=#{id}")
	void delete(Long id);
	

}
