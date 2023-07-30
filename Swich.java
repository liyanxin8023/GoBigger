import java.util.Scanner;
public class Swich{
	public static void main(String[]args) {
	Scanner myScanner =new Scanner(System.in);
	System.out.println("请输入字母(a-g):");
	char c1 =myScanner.next().charAt(0);
	switch(c1){
		case 'a':
			System.out.println("今天星期一，猴子穿新衣");
			break;
		case 'b':
			System.out.println("今天星期一，猴子爬雪山");
			break;
		case 'c':
			System.out.println("今天星期一，猴子当小三");
			break;
		default:
			System.out.println("你输入的字符不正确，没有匹配的");
	}
	System.out.println("退出了switch，继续执行程序");	
	}
}