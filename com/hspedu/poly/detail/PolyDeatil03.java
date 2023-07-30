package com.hspedu.poly.detail;

public class PolyDeatil03 {
	public static void main(String[]args) {
		BB bb=new BB();
		System.out.println(bb instanceof BB);
		System.out.println(bb instanceof AA);
		AA aa =new AA();
		System.out.println(aa instanceof BB);
		System.out.println(aa instanceof AA);
		Object object =new Object();
		System.out.println(object instanceof AA);
		String str="hello";
		System.out.println(str instanceof Object);
	}
}
class AA{}
class BB extends AA{}

