public class Return{
	public static void main(String[]args) {
		for(int i =1;i <= 5; i++) {
			if(i ==3) {
				System.out.println("韩顺平教育"+i);
				return;
			}
			System.out.println("Hello World!");
		}
		System.out.println("go on..");
	}
}