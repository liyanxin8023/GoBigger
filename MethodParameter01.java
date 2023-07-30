public class MethodParameter01{
	public static void main(String[]args) {
		CCC c=new CCC();
		int[]arr= {1,2,3};
		c.test100(arr);
		System.out.println("==main数组情况==");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		person p =new person();
		p.name ="jack";
		p.age =10;
		c.test200(p);
		System.out.print("p.age="+p.age);
	}
}

class CCC {
	public void test200(person p) {
		p.age=10000;
	}
	public void test100(int[]arr) {
		arr[0]=200;
		System.out.println("==test100数组情况==");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}
	