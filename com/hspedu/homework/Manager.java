package com.hspedu.homework;

public class Manager extends Employee{
	private double bouns;
	public Manager(String name,double daysal,int workday,double grade) {
		super(name,daysal,workday,grade);
	}
	public double getBouns() {
		return bouns;
	}
	public void setBouns(double bouns) {
		this.bouns = bouns;
	}
	@Override
	public void printsal() {
		
		System.out.println("经理"+getName()+" 工资="+(bouns
				+getDaysal()*getWorkday()*getGrade()));
	}
}

