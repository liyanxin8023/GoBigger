public class  Constructor03{
	public static void main(String[]args) {
		Person4 p1 =new Person4();
		System.out.println("p1的信息name="+p1.name + "age="+p1.age);
		Person4 p2 =new Person4("scott",50);
		System.out.println("p2的信息name="+p2.name + "age="+p2.age);
	}
}
class Person4{
	String name;
	int age;
	public Person4() {
		age =18;
	}
	public Person4(String pName,int pAge) {
		name =pName;
		age=pAge;
	}
}