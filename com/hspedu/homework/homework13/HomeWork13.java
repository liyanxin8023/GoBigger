package com.hspedu.homework.homework13;

public class HomeWork13 {
	public static void main(String[]args) {
		Teacher teacher =new Teacher("张飞",'男',30,5);
		teacher.printinfo();
		System.out.println("==================");
		Student student=new Student("小明",'男',20,"001");
		student.printinfo();
		
		Person[]persons=new Person[4];
		persons[0]=new Student("jack",'男',10,"0001");
		persons[1]=new Student("mary",'男',20,"0002");
		persons[2]=new Teacher("smith",'男',36,5);
		persons[3]=new Teacher("scott",'男',26,1);
	
		HomeWork13  homework13=new HomeWork13 ();
		 homework13.bubblesort(persons);
		 System.out.println("排序后的数组");
		 for(int i=0;i<persons.length;i++) {
			 System.out.println(persons[i]);
		 }	 
		 System.out.println("============");
		 for(int i=0;i<persons.length;i++) {
		 homework13.test(persons[i]); 
		 }
	}		
	public void test(Person p) {
		if(p instanceof Student ) {
		((Student)p).study();
		}else if(p instanceof Teacher) {
			((Teacher)p).teach();
		}else {
			System.out.println("do nothing");
		}
	}
	public void bubblesort(Person[]persons) {
		Person temp=null;
		for(int i=0;i<persons.length-1;i++) {
			for(int j=0;j<persons.length-1-i;j++) {
				if(persons[j].getAge()<persons[j+1].getAge()) {
					temp=persons[j];
					persons[j]=persons[j+1];
					persons[j+1]=temp;
				}
			}
		}
	}
}

