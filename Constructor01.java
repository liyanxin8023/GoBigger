public class Constructor01{
	
	public static void main(String[]args) {
		Person3 p1 =new Person3("king",40);
		Person3 p2 =new Person3("tom");
	}
}
class Person3{
	String name;
	int age;
	public Person3(String pName,int pAge) {
		name =pName;
		age=pAge;
	}
	public Person3(String PName) { 
		name =PName;
	}
}	