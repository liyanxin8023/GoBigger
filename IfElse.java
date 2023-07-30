import java.util.Scanner;
public class IfElse{
	public static void main(String[]args) {
		Scanner myScanner =new Scanner(System.in);
		System.out.println("请输入月数(1-12):");
		int month = myScanner.nextInt();
		if(month >= 4 && month <=10) {
			System.out.println("该月是旺季，请输入年龄");
			int age =myScanner.nextInt();
			if(age >=18 && age <= 60) {
				System.out.println("票价为60");
			}else if(age < 18 ) {
				System.out.println("票价为30");
			}else {
				System.out.println("票价为20");
			}
			
		}else  {
			System.out.println("该月是淡季，请输入年龄");
			int age =myScanner.nextInt();
			if(age >=18 && age <= 60) {

				System.out.println("票价为40");
			}else {
				System.out.println("票价为20");
			}	
		}		
	}		
}		
			
	

		
	
			
		

	
