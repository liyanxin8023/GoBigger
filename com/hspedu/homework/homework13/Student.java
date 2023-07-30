package com.hspedu.homework.homework13;

public class Student extends Person{
	private String name;
	private char gender;
	private int age;
	private String stu_id;
	public Student(String name, char gender, int age, String stu_id) {
		super(name,gender,age);
		
		this.stu_id = stu_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public void study() {
		System.out.println("我承诺,我会好好学java");
	}
	@Override
	public String play() {
		
		return super.play()+"足球";
	}
	public void printinfo() {
		System.out.println("学生的信息:");
		System.out.println(super.bassinicfo());
		System.out.println("学号: "+stu_id);
		study();
		System.out.println(play());
	}
	@Override
	public String toString() {
		
		return "stu_id="+stu_id+super.toString();
	}
		
}

	

