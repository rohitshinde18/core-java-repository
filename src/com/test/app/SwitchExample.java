package com.test.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// to take runtime input from the user BufferedReader Scanner

// Stream- flow of data
//Input stream - system.in
//output stream - system.out
//error stream - system.err
//system.out.print()

public class SwitchExample {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader ins = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ins);

		System.out.println("Enter a number between 1 to 7:");
		int choice = Integer.parseInt(br.readLine());

		switch (choice) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Wrong Choice..");

		}
	}
}
