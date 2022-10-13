package pkg2;

public class ClassH {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			// to print spaces
			for(int j=4; j>=i; j--)
			{
				System.out.print("  ");
			}
			
			for(int m=1; m<=i; m++)
			{
				// to print stars
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5-1; i++)
		{
			// to print spaces
			for(int j=1; j<=i; j++)
			{
				System.out.print("  ");
			}
			
			for(int m=i; m<=5-1; m++)
			{
				// to print stars
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
