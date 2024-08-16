import java.util.Scanner;

public class IT24102552Lab4Q1
{
public static void main(String []args)
{
	
//declare variables
int x;

Scanner input=new Scanner(System.in);

System.out.println("Enter a number:");
x=input.nextInt();

//if statements

if (x>0){
System.out.println("The number is:positive");
}

else if (x<0){
System.out.println("The number is:negative");
}

else if (x==0){
System.out.println("The number is:zero");
}
}
}



