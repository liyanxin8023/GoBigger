public class TestPerson{
	public static void main(String[]args) {
		Person5 p1 =new Person5("marry",20);
		Person5 p2 =new Person5("marry",20);
		System.out.println("p1和p2比较的结果="+p1.compareto(p2));
	}
}
class Person5{
	String name;
	int age;
	public Person5(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public boolean compareto(Person5 p) {
		if(this.name.equals(p.name)&&this.age==p.age) {
			return true;
			
		}else {
		return false;
		}
	}
}
		