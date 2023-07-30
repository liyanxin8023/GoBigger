public class HomeWork19{
	public static void main(String[]args) {
		Circle1 c =new Circle1();
		PassObject passobject =new PassObject();
		passobject.printAreas(c,5);
	}
}	
class Circle1{
	double radius;
	public Circle1(){
		
	}
	public Circle1(double radius) {
		this.radius =radius;
	}
	public double findArea() {
		return Math.PI*radius*radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	} 
}
	
class PassObject{
	public void printAreas(Circle1 c,int times) {
		System.out.println("radius\tarea");
		for(int i=1;i<=times;i++) {
			c.setRadius(i);
			System.out.println(i+"\t"+c.findArea());
		}
	}
}