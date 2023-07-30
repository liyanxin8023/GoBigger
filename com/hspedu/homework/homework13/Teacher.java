package com.hspedu.homework.homework13;

public class Teacher extends Person{
	private String name;
	private int age;
	private char gender;
	private int work_age;
	public Teacher(String name,char gender,int age, int work_age) {
		super(name,gender,age);
		
		this.work_age = work_age;
	}
	
	public int getWork_age() {
		return work_age;
	}
	public void setWork_age(int work_age) {
		this.work_age = work_age;
	}
	public void teach() {
		System.out.println("我承诺,我会好好教java");
	}
	@Override
	public String play() {
		
		return super.play()+"象棋";
	}
	public void printinfo() {
		System.out.println("老师的信息:");
		System.out.println(super.bassinicfo());
		System.out.println("工龄: "+work_age);
		teach();
		System.out.println(play());
	}
	@Override
	public String toString() {
		return "work_age="+work_age+super.toString();
	}
}
