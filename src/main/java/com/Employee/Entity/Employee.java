package com.Employee.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Emp")
public class Employee {

	@Id
	private Integer EMPNO;
	private String ENAME;
	private String JOB;
	private Integer MGR;
	private Double Sal;
	private Double comm;
	private Integer Dept;

	public Integer getEMPNO() {
		return EMPNO;
	}

	public void setEMPNO(Integer eMPNO) {
		EMPNO = eMPNO;
	}

	public String getENAME() {
		return ENAME;
	}

	public void setENAME(String eNAME) {
		ENAME = eNAME;
	}

	public String getJOB() {
		return JOB;
	}

	public void setJOB(String jOB) {
		JOB = jOB;
	}

	public Integer getMGR() {
		return MGR;
	}

	public void setMGR(Integer mGR) {
		MGR = mGR;
	}

	public Double getSal() {
		return Sal;
	}

	public void setSal(Double sal) {
		Sal = sal;
	}

	public Double getComm() {
		return comm;
	}

	public void setComm(Double comm) {
		this.comm = comm;
	}

	public Integer getDept() {
		return Dept;
	}

	public void setDept(Integer dept) {
		Dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [EMPNO=" + EMPNO + ", ENAME=" + ENAME + ", JOB=" + JOB + ", MGR=" + MGR + ", Sal=" + Sal
				+ ", comm=" + comm + ", Dept=" + Dept + "]";
	}

}