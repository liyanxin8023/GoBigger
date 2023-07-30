public class HomeWork14{
	public static void main(String[]args) {
		Circle circle=new Circle(3);
		System.out.println("面积="+circle.area());
		System.out.println("周长="+circle.lean());
		
	}	
}
class Circle{
	double radius;
	public Circle(double radius) {
		this.radius =radius;
		}

public double area() {
	return Math.PI*radius*radius;
}
public double lean() {
	return 2*Math.PI*radius;
	}
}