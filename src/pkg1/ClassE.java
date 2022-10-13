package pkg1;

import java.util.Scanner;

public class ClassE {

	public static void main(String[] args) {
		
		// 4. If-else If
		
		// Q. Print grade when user gives percentage of student?
		// 91-100 --> A Grade
		// 81-90  --> B Grade
		// 71-80  --> C Grade
		// 60-70  --> D Grade
		// below 60 --> Fail

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the percentage of student : ");
		int percentage = scn.nextInt();
		
		if(percentage >= 91 )
		{
			System.out.println("Grade is A");
		}
		else if(percentage >= 81)
		{
			System.out.println("Grade is B");
		}
		else if(percentage >= 71)
		{
			System.out.println("Grade is C");
		}
		else if(percentage >= 60)
		{
			System.out.println("Grade is D");
		}
		else
		{
			System.out.println("You are Fail");
		}
		scn.close();
	}
}
