package com.hspedu.poly.polyparamater;

public class Polyparamater {
	public static void main(String[]args) {
		Woker tom =new Woker("tom",2500);
		Manager milan=new Manager("milan",5000,20000);
		 Polyparamater  polyparamater=new  Polyparamater();
		 polyparamater.showEmpAnnual(milan);
		 polyparamater.showEmpAnnual(tom);
		 polyparamater.testwork(tom);
		 polyparamater.testwork(milan);
	}

public void showEmpAnnual(Employee e) {
	System.out.println(e.getAnnual());
	}
public void testwork(Employee e) {
		if(e instanceof Woker) {
			((Woker)e).work();
		}else if(e instanceof Manager) {
			((Manager) e).manage();
		}else {
			System.out.println("不做处理");
		}
	}
}