public class Method03{
	public static void main(String[]args){
		AA a =new AA();
		a.print(4, 4, '*');
		if(a.isOdd(2)) {
			System.out.println("是奇数");
		}else {
			System.out.println("是偶数");
		}
	}
}
class AA{
	public boolean isOdd(int num) {
		return num % 2 !=0;
	}
	public void print(int row, int col, char c) {
		for(int i =0; i<row; i++) {
			for(int j =0; j<col; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}