package com.hspedu.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChange{
	public static void main(String[]args) {
		boolean loop =true;
		Scanner scanner =new Scanner(System.in);
		String key ="";
		double money=0;
		double balance =0;
		Date date =null;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh-mm");
		String note ="";
		String details="\n------------零钱通明细------------";
		do {
			System.out.println("============零钱通菜单===========");
			System.out.println("\t\t1 零钱通明细");
			System.out.println("\t\t2 收益入账");
			System.out.println("\t\t3 消费");
			System.out.println("\t\t4 退出");
			System.out.println("请选择（1-4）");
			key=scanner.next();
			switch (key){
			case "1" :
				System.out.println(details);
				break;
			case "2" :
				System.out.println("收益入账金额:");
				money=scanner.nextDouble();
				if(money<=0) {
					System.out.println("收益入账金额需要大于0");
					break;
				}
				balance+=money;
				date =new Date();
				
				details+="\n收益入账\t+" +money+" \t"+sdf.format(date)+" \t"+balance;
				break;
			case "3" :
				System.out.println("消费金额");
				money=scanner.nextDouble();
				if(money<=0||money>balance) {
					System.out.println("你的消费金额必须在0-"+balance);
				break;
				}
				System.out.println("消费说明");
				note=scanner.next();
				balance-=money;
				date =new Date();
				details="\n"+note+"\t-"+money+" \t"+sdf.format(date)+" \t"+balance;
			
			case "4" :
				String choice="";
				while(true) {
					System.out.println("你确定要退出吗 y/n");
					choice=scanner.next();
					if("y".equals(choice)||"n".equals(choice)) {
						break;
					}
				}
				if(choice.equals("y")) {
					loop=false;
					System.out.println("退出了零钱通应用....");
				}
				break;
				
			default :
				System.out.println("选择有误，请重新选择");
			}
			
			
			
		}while(loop);
	}
}
