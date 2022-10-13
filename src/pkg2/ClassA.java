package pkg2;

public class ClassA {

	public static void main(String[] args) {
		
		// Iterational Statements
		// 1. For Loop ---> STAR PATTERNS
		
		for(int i =1; i<=5; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			for(int m=1; m<=i; m++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}

}
