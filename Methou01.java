public class Methou01{
	public static void main(String[]args){
		int[][]map= {{0,0,1},{1,1,1},{1,1,3}};
		Mytools tool=new Mytools();
		tool.printarr(map);
		tool.printarr(map);
		tool.printarr(map);
	}
}
class Mytools{
	public void printarr(int[][]map) {
		System.out.println("======");
	for(int i =0;i<map.length;i++) {
		for(int j=0;j<map[i].length;j++) {
			System.out.print(map[i][j]+" ");
			}
		System.out.println();
		}
	}
}