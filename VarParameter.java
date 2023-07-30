public class VarParameter{
	public static void main(String[]args) {
		HspMethod hspmethod=new HspMethod();
		System.out.println(hspmethod.sum(1,5,100));
		System.out.println(hspmethod.sum(1,19));
		System.out.println(hspmethod.showScore("milan",90.1,80.0));
		System.out.println(hspmethod.showScore("terry",90.1,80.0,70.0,60.0,95.6));
	}
}
class HspMethod{
	public int sum(int...nums) {
		int res =0;
		for(int i =0;i<nums.length;i++) {
			res+=nums[i];
		}
		return res;
	}
	public String showScore(String name,double...scores) {
		double totalscore =0;
		for(int i =0;i<scores.length;i++) {
			totalscore+=scores[i];
		}
		return name+"有"+scores.length+"门课的成绩总分="+totalscore;
	}
}
