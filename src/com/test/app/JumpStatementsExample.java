package com.test.app;

public class JumpStatementsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1, limit=100; 
		
		for(;i<=limit;i++) //for(initialization; expression; validation)
		{
			System.out.println(i);
			if(i==50) {
//				break;
				continue;
			}
		}
		System.out.println("outdise of for block");
	}
}
