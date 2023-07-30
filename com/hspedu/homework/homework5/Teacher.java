package com.hspedu.homework.homework5;

public class Teacher extends Employee {
	private int classdays;
	private double classsal;
	public Teacher(String name, double sal) {
		super(name,sal);
	}
	public int getClassdays() {
		return classdays;
	}
	public void setClassdays(int classdays) {
		this.classdays = classdays;
	}
	public double getClasssal() {
		return classsal;
	}
	
	public void setClasssal(double classsal) {
		this.classsal = classsal;
	}
	@Override
	public void printsal() {
		System.out.print("老师");
		System.out.println(getName()+" 年工资="+(getSal()*getSalmonth()+classdays*classsal));
	}	
}
	
	
		
	


