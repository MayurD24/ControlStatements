package pkg2;

public class ClassC {

	public static void main(String[] args) {
		
    // first to print right angled triangle with length 5
			for(int i =1; i<=5; i++)     // for rows
		    {
			   for(int j=1; j<=i; j++)   // for stars
			   {
				  System.out.print("* "); 
			   }
			   System.out.println();     
		    }
		
	// now to print inverted right angle triangle with length-1 side
			for(int m=1; m<=5-1; m++)       // for rows
			{
				for(int k=m; k<=5-1; k++)   // for stars
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			

	
	
	}

}
