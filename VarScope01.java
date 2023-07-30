public class VarScope01{
	public static void main(String[]args) {
		Person1 p1 =new Person1();
		p1.say();
		T1 t1=new T1();
		t1.test();
		t1.test2(p1);
	}
}
class T1{
	public void test(){
	Person1 person =new Person1();
	System.out.println(person.name);
	}
	public void test2(Person1 p){
		System.out.println(p.name);
	}
}	
class Person1{
	
		String name ="jack";
	
	public void say() {
		String name="king";
		System.out.println("say()name="+name);
	}
	public void hi(){
		String address="北京";
		String name ="hsp";
	}
}