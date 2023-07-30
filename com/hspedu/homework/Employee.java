package com.hspedu.homework;
public class Employee {
	private String name;
	private int workday;
	private double daysal;
	private double grade;
	public Employee(String name,double daysal,int workday,double grade) {
		this.name =name;
		this.daysal =daysal;
		this.workday =workday;
		this.grade=grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDaysal() {
		return daysal;
	}
	public void setDaysal(double daysal) {
		this.daysal = daysal;
	}
	public int getWorkday() {
		return workday;
	}
	public void setWorkday(int workday) {
		this.workday = workday;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public void printsal() {
		System.out.println(name+" 工资="+daysal*workday*grade);
	}
}

