package pkg1;

import java.util.Scanner;

public class ClassC {

	public static void main(String[] args) {
		
		// 3. Nested if 
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Find the Largest number?");
		System.out.println("Enter the three numbers : ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		if(b>c)       // b>c
		{
			if(b>a)   
			{
				System.out.println("b is the largest number");
			}
			else      // a>b ----> a>b>c
			{
				System.out.println("a is the largest number");
			}
		}
		else    // c>b
		{
			if(a>c)   // a>c>b
			{
				System.out.println("a is the largest number");
			}
			
			else      // c>a
			{
				System.out.println("c is the largest number");
			}
		}
	scn.close();
	
	}

}
