package pkg1;

import java.util.Scanner;

public class ClassD {

	public static void main(String[] args) {
		
		// Nested if
		
		String usernamedb = "mayurd24";
		String passdb = "Mayur@24";
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the user name : ");
		String username = scn.nextLine();
		
		if(username.equals(usernamedb))
		{
			System.out.println("Enter the password : ");
			String password = scn.nextLine();
			
			if(password.equals(passdb))
			{
				System.out.println("You are Successfully logged in");
		    }
			else
			{
				System.out.println("Password is incorrect");
			}
		}
		else
		{
			System.out.println("User name is incorrect");
		}
		scn.close();
	}

}
