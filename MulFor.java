import java.util.Scanner;
public class MulFor{
	public static void main(String[]args) {
		Scanner myScanner =new Scanner(System.in);
		double tatolscore = 0;
		int passnum =0;
		for(int i =1; i<=3; i++) {
		double sum =0;
		for(int j =1; j <=5; j++) {
			System.out.println("请输入第"+i+"个班的第"+j+"个学生的成绩");
			double score = myScanner.nextDouble();
			if(score >= 60) {
				passnum++;
			}
			System.out.println("成绩是"+score);
			sum += score;
		}
		System.out.println("sum"+sum + "平均分"+sum/5);
		tatolscore += sum;
		}
		System.out.println("三个班总分="+tatolscore + "平均分"+tatolscore/15);
		System.out.println("及格人数有"+passnum);
	}
}		
