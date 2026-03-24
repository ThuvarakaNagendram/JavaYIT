import java.util.Scanner;

class GradeCalculator{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter marks for subject 1: ");
		int marks1=scanner.nextInt();
		
		System.out.print("Enter marks for subject 2: ");
		int marks2=scanner.nextInt();
		
		System.out.print("Enter marks for subject 3: ");
		int marks3=scanner.nextInt();
		
		int total=marks1+marks2+marks3;
		//System.out.println("your total is: "+total);

		double average=total/3;
		//System.out.println("Your average is: "+average);
		
		
		
		if(average<=100 && average>=75){
			grade='A'
		}
		
		
	}
}