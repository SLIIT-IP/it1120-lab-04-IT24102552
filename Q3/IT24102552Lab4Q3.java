import java.util.Scanner;

public class IT24102552Lab4Q3
{
	public static void main(String[]args)
	{
		
		//declare variables
		int x;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		x=input.nextInt();
		
		//ternary operator
		String result = (x>0)?"The number is:positive":
		                (x<0)?"The number is:negative":
						      "The number is:zero";
							  
		//print result
		System.out.println(result);
		
	}
}

		
	



	