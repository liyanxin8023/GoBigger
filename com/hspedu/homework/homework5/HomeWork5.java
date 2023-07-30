package com.hspedu.homework.homework5;

public class HomeWork5 {
	public static void main(String[]args) {
		Worker worker =new Worker(" jack",10000);
		worker.printsal();
		Peasant peasant=new Peasant(" smith",20000);
		peasant.printsal();
		Teacher teacher =new Teacher(" 顺平",2000);
		teacher.setClassdays(360);
		teacher.setClasssal(1000);
		teacher.printsal();
		Scientist scientist=new Scientist(" 钟南山",20000);
		scientist.setBouns(2000000);
		scientist.printsal();
	}
}
