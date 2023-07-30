public class ThisDetail{
	public static void main(String[]args) {
		Ta ta=new Ta();
		ta.f2();
		ta.f3();
	}
}
class Ta{
	String name ="jack";
	int num =100;
	public Ta() {
		this("jack",100);
		System.out.println("Ta()构造器");
	}
	
	public Ta(String name ,int age ) {
		System.out.println("Ta(String name ,int age ) 构造器");
	}
	
	public void f1() {
		System.out.println("f1()方法..");
	}
	public void f2() {
		System.out.println("f2()方法..");
		f1();
		this.f1();
	}
	public void f3() {
		String name ="smith";
		System.out.println("name="+name+"num"+num);
		System.out.println("name="+this.name+"num"+this.num);
	}
}