package com.hspedu.homework.homework5;

public class Worker extends Employee {
	public Worker(String name, double sal) {
		super(name,sal);
	}
	@Override
	public void printsal() {
		System.out.print("工人");
		super.printsal();
	}
}
