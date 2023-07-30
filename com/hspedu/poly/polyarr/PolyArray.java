package com.hspedu.poly.polyarr;

public class PolyArray {
	public static void main(String[]args) {
	Person[]persons=new Person[5];
	persons[0]=new Person("jack",20);
	persons[1]=new Student("mary",18,100);
	persons[2]=new Student("smith",19,30.1);
	persons[3]=new Teacher("scott",30,20000);
	persons[4]=new Teacher("king",50,25000); 
	
	for(int i=0;i<persons.length;i++) {
		System.out.println(persons[i].say());
		
	if(persons[i] instanceof Student) {
		Student student=(Student)persons[i];
			student.study();	
	}else if(persons[i] instanceof Teacher) {	
		Teacher teacher =(Teacher)persons[i];
		teacher.teach();
	}else if(persons[i] instanceof Person) {
		System.out.println("你的类型有误，请检查...");
	}		
		}	
	}
}
