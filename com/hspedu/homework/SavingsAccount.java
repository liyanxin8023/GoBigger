package com.hspedu.homework;

public class SavingsAccount extends BankAccount {
	private int count=3;
	private double rate=0.01;
	public SavingsAccount(double initialBalance) {
		super(initialBalance);
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public void deposit(double amount) {
		if(count>0) {
		super.deposit(amount);
		}else {
			super.deposit(amount-1);
		}
		count--;
	}	
	@Override
	public void withdraw(double amount) {
		if(count>0) {
			super.withdraw(amount);
		}else {
			super.withdraw(amount);
		}
		count--;
	}
	public void earnMothlyINterst(){
	 count =3;
	 super.deposit(getBalance()*rate);
	}
}