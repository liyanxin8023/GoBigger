package com.hspedu.extend_;

public class Sub extends Base {
	public Sub(String name,int age) {
		
		super("king",20);
		System.out.println("子类构造器sub(String name,int age)被调用");
	}
public Sub() {
	System.out.println("子类构造器sub()被调用");
}
public Sub(String anme) {
	
	System.out.println("子类构造器sub(String name)被调用");
}
public void sayok() {
	System.out.println(n1+" "+n2+" "+n3);
	test100();
	test200();
	test300();
	System.out.println("n4="+getN4());
	callTest400();
	}
}
