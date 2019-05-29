package com.app.model;

public class Employe {

	private String empName;
	private Double empSal;
	public Employe() {
		super();
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employe [empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
	
}
