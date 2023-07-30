package com.hspedu.extend_;

public class ExtendsTheory {
	public static void main(String[]args) {
		Son son =new Son();
		System.out.println(son.name);
		System.out.println(son.getAge());
		System.out.println(son.happy);
	}
}
class GrendPa{
	String name="大头爷爷";
	String happy ="旅游";
}
class Father extends GrendPa{
	String name ="大头爸爸";
	private int age =30;
	public int getAge() {
		return age;
	}
}

class Son extends Father{
	String name="大头儿子";
}
	