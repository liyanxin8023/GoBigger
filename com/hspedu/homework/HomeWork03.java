package com.hspedu.homework;

public class HomeWork03 {
	public static void main(String[]args) {
		Manager manager=new Manager(" 刘备",100,20,1.2);
		manager.setBouns(3000);
		manager.printsal();
		
		Worker worker=new Worker(" 关羽",50,10,1.0);
		worker.printsal();
	}
}
