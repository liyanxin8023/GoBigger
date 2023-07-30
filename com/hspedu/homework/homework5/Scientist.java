package com.hspedu.homework.homework5;

public class Scientist extends Employee{
	private double bouns;
	public Scientist(String name, double sal) {
		super(name,sal);
	}
	public double getBouns() {
		return bouns;
	}
	public void setBouns(double bouns) {
		this.bouns = bouns;
	}
	@Override
	public void printsal() {
		System.out.print("科学家");
		System.out.println(getName()+" 年工资="+(getSal()*getSalmonth()+bouns));
	}
}
