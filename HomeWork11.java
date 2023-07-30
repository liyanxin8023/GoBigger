public class HomeWork11{
	public static void main(String[]args) {
		String[]strs= {"milan","jack","tom","smith"};
		A02 a02 =new A02();
		int index=a02.find("milan",strs);
		System.out.println("index="+index);
	}
}
class A02{
	public int find(String findstr,String[]strs) {
		for(int i =0;i<strs.length;i++) {
			if(findstr.equals(strs[i])) {
				return i;
			}
		}
		return -1;
	}
}