public class VarScope{
	public static void main(String[]args) {
		
	}
}
class cat{
	int age =10;
	public void cry(){
		int n =10;
		String name ="jack";
		System.out.println("age="+age);
	}
	
	public void eat() {
		System.out.println("age="+age);
	}
}