public class DoWhile01{
	public static void main(String[]args) {
		int i =1;
		do {
			System.out.println("i=" +i);
			i++;
		}while(i<=100);
		System.out.println("退出do..while,继续执行.."+i);
	}
}