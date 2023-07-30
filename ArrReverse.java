public class ArrReverse{
	public static void main(String[]args) {
		int[]arr= {11,22,33,44,55,66};
		int temp =0;
		int lean =arr.length;
		for(int i =0; i <lean/2;i++) {
			temp =arr[lean -1 -i];
			arr[lean -1 -i]=arr[i];
			arr[i]=temp;
		}
		System.out.println("===反转后数组===");
		for(int i =0; i <lean;i++) {
			System.out.print(arr[i]+"\t");
		}
	}		
}	