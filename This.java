public class This{
	public static void main(String[]args) {
		Dog1 dog1=new Dog1("大壮",3);
		dog1.info();
		System.out.println("dog1的hashcode="+dog1.hashCode());
		Dog1 dog2=new Dog1("大黄",4);
		dog2.info();
		System.out.println("dog2的hashcode="+dog2.hashCode());
	}
}
class Dog1{
	String name;
	int age;

	public Dog1(String name ,int age ) {
		this.name =name;
		this.age =age;
		System.out.println("this.hashCode="+this.hashCode());
	}

	public void info() {
		System.out.println(name+"\t"+age+"\t");
	}	
}	
