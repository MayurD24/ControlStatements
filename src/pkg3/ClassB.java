package pkg3;

import java.util.Scanner;

public class ClassB { 

	public static void main(String[] args) {
		
		// Find the Palindrome numbers from given range
		// Palindrome number --> reverse number is same to original
		// if we devide any number by 10 then we get remainder as its indivial digits
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the range of two numbers : ");
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		System.out.println("The palindrome numbers in the given range are : ");
		
		for(int i=n1; i<=n2; i++)
		{
			int temp = i;
			int reverse = 0; 
			
			while(temp>0)
			{
				int rem = temp%10;
				temp = temp/10;  
				reverse = reverse * 10 + rem; //121....121
			}
			if(reverse==i)  
			{
				System.out.println(i);
			}
		}
		scn.close();
	}

}
