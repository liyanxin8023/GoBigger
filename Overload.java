public class Overload{
	public static void main(String[]args) {
		 Mcalculator mc =new  Mcalculator();
		 System.out.println(mc.calculate(1,2));
		 System.out.println(mc.calculate(1.1,2));
	}
}
class Mcalculator{
	public int calculate(int n1, int n2) {
	return n1 +n2;
	}
	public double calculate(int n1, double n2) {
		return n1 +n2;
	}
	public double calculate(double n1, int n2) {
		return n1 +n2;
	}
	public int calculate(int n1, int n2,int n3) {
		return n1 +n2+n3;
		}
}	