package com.test;

public class TestMainClass {

	public static void main(String[] args) {
		TestClass tc1 = new TestClass();
		tc1.method1();
		method2();
	}
	
	public static void method2(){
		System.out.println("In method2");
		
		System.out.println("In method2 another statement");
		System.out.println("----------------------------");
		System.out.println("In method2 one more statement");
	}

}
