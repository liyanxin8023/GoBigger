package com.hspedu.homework.homework5;

public class Peasant extends Employee {
	public Peasant(String name, double sal) {
		super(name,sal);
	}
	@Override
	public void printsal() {
		System.out.print("农民");
		super.printsal();
	}
}

