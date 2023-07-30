public class HomeWork16{
	public static void main(String[]args) {
		Dog2 dog=new Dog2("小白","白色",3);
		dog.show();
	}
}
class Dog2{
	String name;
	String color;
	int age;
	public Dog2(String name,String color ,int age) {
		this.name =name;
		this.color=color;
		this.age =age;
	}
	public void show() {
		System.out.println("name="+name+"color="+color+"age="+age);
		}
	}
	