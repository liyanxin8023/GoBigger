public class  Constructor{
	
	public static void main(String[]args) {
		Person2 p1 =new Person2("smith",80);
		System.out.println("p1的信息如下");
		System.out.println("p1对象的name="+p1.name);
		System.out.println("p1对象的age="+p1.age);
	}
}
class Person2{
	String name;
	int age;

public Person2(String pName,int pAge) {
	System.out.println("构造器被调用～完成对象的属性初始化");
	name =pName;
	age=pAge;
	}
}