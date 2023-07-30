package com.hspedu.Object;

public class ToString {
public static void main(String[]args) {
	Manster monster =new Manster("小妖怪","巡山的",2000);
	System.out.println(monster.toString()+"hashCode"+monster.hashCode());
	System.out.println(monster);
	}
}
class Manster{
	private String name;
	private String job;
	private double sal;
	public Manster(String name,String job, double sal) {
		this.name=name;
		this.job =job;
		this.sal=sal;
	}
@Override
public String toString() {
	
	return "name="+name+" job="+job+" sal="+sal;
}

}

	
	

