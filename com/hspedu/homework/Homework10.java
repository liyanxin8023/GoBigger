package com.hspedu.homework;

public class Homework10 {
	public static void main(String[]args) {
		Dector dector1=new Dector("jack",20,"牙科医生",'男',20000);
		Dector dector2=new Dector("jack",20,"牙科医生",'男',20000);	
		System.out.println(dector1.equals(dector2) );
	}
}