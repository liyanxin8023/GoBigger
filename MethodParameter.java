public class MethodParameter{
	public static void main(String[]args) {
		int a =10;
		int b =20;
		BB obj = new BB();
		obj.swap(a,b);
		System.out.println("main方法a="+ a + "b="+b);
	}
}
class BB {
	public void swap(int a, int b) {
		System.out.println("\na="+a+"\tb="+b);
		int temp =a;
		a =b;
		b =temp;
		System.out.println("\na="+a+"\tb="+b);
	} 
}