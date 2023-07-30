public class Switch02{
	public static void main(String[]Args) {
		double score = 100;
		if(score >=0 && score <= 100) {
		switch((int)(score/60)) {
		 case 0:
			 System.out.println("成绩不合格");
			 break;
		 case 1:
			 System.out.println("成绩合格");
			 break;
		} 
			 
		}else {
			System.out.println("输入的成绩在0-100之间");
		}
	}
}