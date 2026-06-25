package com.javacoding;
/**
 * this class is used for performing operations on bank accounts
 */
// the above syntax is documentation comments
public class Bank {
	static int currentBalance = 1000;
	public static void greetCustomer() {
		//method body
		System.out.println("Hello,Welcome to the bank application");
		
	}
	public void deposit(int amount) {
		currentBalance = currentBalance + amount ;
		System.out.println("Amount is  depoisted successfully");
		
	}
	public static  void withdrawal(int amount) {
		currentBalance = currentBalance - amount ;
		System.out.println("Amount is withdrawn suceesfully" );
		
	}
	public int  getCurrentBalance() {
		return currentBalance ;
		
	}
	  
		public static void main(String[] args) {
			Bank bank = new Bank();//object
			greetCustomer();
			System.out.println("current balance is : "+bank.getCurrentBalance());
			bank.deposit(500);//object/method
			System.out.println("current balance is : "+bank.getCurrentBalance());
			
			
	}

}
