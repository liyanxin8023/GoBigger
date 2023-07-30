public class Method{
	public static void main(String[]args) {
		person p1 =new person();
		p1.speak();
		p1.cal01(5);
		p1.cal01(10);
	int returnsum= p1.getSum(40,20);
	System.out.println("getSum方法返回的值是"+returnsum);
	}
}
class person{
	String name;
	int age;
	public void speak() {
		System.out.println("我是一个好人");
	}
	public void cal01(int n){
		int sum =0;
		for(int i =1;i<=n;i++) {
			sum += i;
		}
		System.out.println("sum="+sum);
	}
	public int getSum(int num1,int num2) {
		int sum =num1 +num2;
		return sum; 
	}
}	
	
		
