package com.hspedu.homework;

public class BankAccount {
	public double balance;
	public BankAccount(double balance) {
		this.balance =balance;
	}
	public void deposit(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) {
		balance-=amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
