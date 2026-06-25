package com.javacoding;

public class Test {
	int i  ;
	int j  ;

	//constructor 
	public Test() {
		i = 10 ;
		j = 20 ;  
		//default value //test()
		
		
	}
	public Test (int i, int j ) {
		this.i = i ;
		this.j = j;
		
		
	}

	public static void main(String[] args) {
		Test t1 = new Test ();
		Test t2 = new Test(10,25);
		Test t3 = new Test(80,50);
		System.out.println(t1.add());
		System.out.println(t2.add());
		System.out.println(t3.add());
		
		System.out.println(t1 == t2);
		System.out.println(t2 == t3);
		//t1 and t2 are 2 different objects objects can contain methods and variables in it 
		
		System.out.println(t3.i);
		System.out.println(t3.j);
	}
	public int add() {
		return i+j;
	}
}