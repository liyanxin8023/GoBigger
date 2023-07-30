package com.hspedu.homework;

public class Worker extends Employee {
	public Worker(String name,double daysal,int workday,double grade) {
		super(name,daysal,workday,grade);
	}
	@Override
	public void printsal() {
		System.out.print("普通员工");
		super.printsal();
	}
}
