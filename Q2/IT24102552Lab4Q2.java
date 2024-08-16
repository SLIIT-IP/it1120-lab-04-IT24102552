import java.util.Scanner;

public class IT24102552Lab4Q2
{
	public static void main(String[]args)
	{
		
		//declaring variables
		double Exam_marks,Lab_marks,Exam_percentage,Lab_percentage,Final_mark;
		
		Scanner input=new Scanner(System.in);
		
		//entering exam marks
		System.out.println("Please enter exam marks(out of 100):");
		Exam_marks=input.nextDouble();
		
		//if statement for exam mark validation
		if (Exam_marks<0 || Exam_marks>100){
		System.out.println("Invalid input for exam marks.Terminating program.");
		return;}
		
		//entering lab marks
		System.out.println("Please enter lab marks(out of 100):");
		Lab_marks=input.nextDouble();
		
		//if statement for validating lab marks
		if (Lab_marks<0 || Lab_marks>100){
		System.out.println("Invalid input for lab marks.Terminating program.");
		return;}
		
		//entering percentages
		System.out.println("Please enter the percentage given for exam:");
		Exam_percentage=input.nextDouble();
		
		System.out.println("Please enter the percentage given for lab:");
		Lab_percentage=input.nextDouble();
		
		//if statement validating the percentages
		if (Exam_percentage+Lab_percentage!=100){
		System.out.println("The percentages must add up to 100.Terminating program");
		return;}
		
		//calculation for final mark
		Final_mark=(Lab_marks*(Lab_percentage/100))+(Exam_marks*(Exam_percentage/100));
		
		System.out.println("Final exam mark is:" +Final_mark);
	}
} 
		
		
		