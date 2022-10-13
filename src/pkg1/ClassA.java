package pkg1;

import java.util.Scanner;

public class ClassA {

	
	public static void main(String[] args) {
		
		// Selection Statements
		// 1. If statement
		
		System.out.println("Enter the number : ");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
			
		if (a>20) 
		{
			System.out.println("number is greater than 20");
		}
	scn.close();
	}
}
