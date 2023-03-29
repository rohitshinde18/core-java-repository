package com.test.app;

public class OperatorsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20;
		
		int result=(a<b)?a:b;   //Ternary operator
		System.out.println(result);
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(b%a);
		//Arithmetic operator
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		//Relational Operator
		
		System.out.println(a>>2);
		// 10 - 100 - 0010 - 2
		
		System.out.println(b<<2);
		//20 - 10100 - 1010000 - 80
		
		a=a+10;
		a+=10;
		
		a=a*b;
		a*=b;

	}

}
