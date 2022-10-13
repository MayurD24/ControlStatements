package pkg3;

import java.util.Scanner;

public class ClassA {

	public static void main(String[] args) {
		
		// While loop
		// find the prime numbers
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the range to find prime numbers : ");
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		System.out.println("The prime numbers in the given range are : ");
		
		for(int i=n1; i<=n2; i++)
		{
			int count = 0;
			int temp = i;
			
			while(temp>0)
			{
				int rem = i%temp;
				
				if(rem==0)
				{
					count++;
				}
				temp--;
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
		scn.close();
	}

}
