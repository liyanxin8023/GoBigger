public class Recursion02{
	public static void main(String[]args) {
		TTT t1 =new TTT();
		int day =1;
		int peathNum =t1.peath(day);
		if(peathNum != -1) {
			System.out.println("第"+day+"天有"+peathNum+"个桃子");
		}
	}
}
class TTT{
public int peath(int day) {
	if(day ==10) {
		return 1;
	}else if(day >=1 && day<=9) {
		return (peath(day+1)+1)*2;
		}else {
			System.out.println("day必须在1-10之间");
			return -1;
		}
	}
}