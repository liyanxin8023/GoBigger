public class Stars{
	public static void main(String[]args) {
		int tatollevel = 5;
		for(int i =1; i <= tatollevel;i++) {
			for(int k =1; k <= 5 - i; k++) {
				System.out.print(" ");
			}
			for(int j =1; j<=2*tatollevel-1; j++) { 
				if(j == 1 ||j== 2 * i - 1 || i == tatollevel) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			
			}
			System.out.println("");
		}	
	}	
}
	
