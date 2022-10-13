package pkg1;

import java.util.Scanner;

public class ClassF {

	public static void main(String[] args) {
		
		// 5. Switch
		
		// Print Priority
		// high - 1 , medium - 2, low - 3.
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter priority code : ");
		int priority = scn.nextInt();
		
		switch(priority)
		{
		case 1:
			System.out.println("High priority");
			break;
		case 2:
			System.out.println("Medium priority");
			break;
		case 3:
			System.out.println("Low priority");
			break;
		default:
			System.out.println("Defect is resolved");
		}
		
		scn.close();
    }

}
