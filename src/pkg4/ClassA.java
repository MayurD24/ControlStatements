package pkg4;

public class ClassA {

	public static void main(String[] args) {

     // Jump Statements
		
		// 1. Break----> break;
		
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i%2==0) {
		          break;
				}
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
