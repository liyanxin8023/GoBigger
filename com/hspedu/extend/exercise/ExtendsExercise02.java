package com.hspedu.extend.exercise;

public class ExtendsExercise02 {
	public static void main(String[]args) {
		C1 c = new C1();
		}
	}
	class A1{
		public A1(){
			System.out.println("我是A类");
		}
	}
	class B1 extends A1{
		public B1() {
			System.out.println("我是B类的无参构造器");
		}
		public B1(String anme) {
			System.out.println("我是B类的有参构造器");
		}
	}
	class C1 extends B1{
		public C1(){
			this("hello");
			System.out.println("我是C类的无参构造器");
		}
		public C1(String anme){
			super("hahah");
			System.out.println("我是C类的有参构造器");
		}
	}

