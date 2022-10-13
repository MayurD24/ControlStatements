package pkg1;

import java.util.Scanner;

public class ClassB {

	public static void main(String[] args) {
		
	// 2. If-else
		
	//	int a = 20;    // we want to take input from user
	//	int b = 45;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = scn.nextInt();
		
		System.out.println("Enter the second number : ");
		int b = scn.nextInt();
		
        if(a > b)   // if true it executes if block & for false else block.
        {
        	System.out.println("First number is the largest");
        }
        else
        {
        	System.out.println("Second number is the largest");
        }
        
        scn.close();
        }

}
