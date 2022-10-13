package pkg4;

import java.util.Scanner;

public class ClassC {

	public static void main(String[] args) {
		
		// 3. Ruturn ---> return ref_variable;

		ClassC obj = new ClassC();
		int d = obj.addition();
		System.out.println("The addition is : " + d);	
	}
	
	public int addition() {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the two numbers : ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = a + b;
		scn.close();
		return c;	
	}
}
