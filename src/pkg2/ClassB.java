package pkg2;

import java.util.Scanner;

public class ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = scn.nextInt();
		
		
		for(int i =1; i<=n; i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			
			for(int m=n; m>=i; m--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		scn.close();
	}

}
