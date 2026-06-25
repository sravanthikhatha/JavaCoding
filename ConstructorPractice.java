package com.javacoding;

public class ConstructorPractice {
	public int i ;

	public static void main(String[] args) {
	//object 
    ConstructorPractice cp = new  ConstructorPractice (56);
		System.out.println(cp.i);
	}
	// default explicit parameter less constructor 
	public ConstructorPractice() {
		i = 20 ;
	}
	
    public ConstructorPractice(int a) {
    	i = a;
    	System.out.println("Constructor is called");
    }
	}

    // if user defined the constructor is known as explicit constructor
	// rules- constructor name same as class name
	//no return type /no return value so no need of void
	//default constructor are always public
    //default constructor are provided by java
    // constructor only created in public ,private and protected

