package com.hspedu.extend_;

public class ExtendsDetail {
	public static void main(String[]args) {
	Sub sub=new Sub();
	System.out.println("=====2=====");
	sub.sayok();
	Sub sub2=new Sub("jack");
	System.out.println("=====3=====");
	Sub sub3=new Sub("tom",10);
	}
}
