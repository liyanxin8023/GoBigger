public class Continue{
	public static void main(String[]args) {
		labe1:
			for(int j =0; j < 4;j++) {
		labe2:
			for(int i =0; i <10; i++) {
				if(i ==2) {
				continue;
				}
				System.out.println("i="+i );
			}
			}
		
	}		
}