package com.jackyliao.boot.vo;

import java.util.Date;

public class Employee {

	private Long id; 
	private String empNo;
	private String eName; 
	private String job;
	private Date hireadete; 
	private Integer sal;
	private Integer comm;
	
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empNo=" + empNo + ", eName=" + eName + ", job=" + job + ", hireadete="
				+ hireadete + ", sal=" + sal + ", comm=" + comm + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getHireadete() {
		return hireadete;
	}
	public void setHireadete(Date hireadete) {
		this.hireadete = hireadete;
	}
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}
	public Integer getComm() {
		return comm;
	}
	public void setComm(Integer comm) {
		this.comm = comm;
	}
	
	
}
