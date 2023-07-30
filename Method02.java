public class Method02{
	public static void main(String[]args){
		A a =new A();
		a.sayok();
		a.m1();
	}
}
class A{
	public void print(int n) {
		System.out.println("print方法被调用n="+n);
	}
	public void sayok(){
		print(10);
		System.out.println("继续执行sayok~~~");
	}
public void m1() {
	System.out.println("m1方法被调用");
	B b =new B();
	b.hi();
	System.out.println("m1继续执行~~~");
	}
}

	

class B{
	public void hi(){
		System.out.println("B类中的hi方法被执行");
	}
}