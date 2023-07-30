package com.hspedu.poly.polyparamater;

public class Woker extends Employee {
	public Woker(String name,double salary) {
		super(name,salary);
	}
	public void work() {
		System.out.println("普通员工 "+getName()+" is working");
	}
	public double getAnnual() {
		return super.getAnnual();
	}
}	

