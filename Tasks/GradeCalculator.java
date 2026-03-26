import java.util.Scanner;

class GradeCalculator{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		char grade;
		
		System.out.print("Enter marks for subject 1: ");
		int marks1=scanner.nextInt();
		
		System.out.print("Enter marks for subject 2: ");
		int marks2=scanner.nextInt();
		
		System.out.print("Enter marks for subject 3: ");
		int marks3=scanner.nextInt();
		
		int total=marks1+marks2+marks3;

		double average=total/3;
g		
		if(average<=100 && average>=75){
			System.out.println("Grade : A");
		}else if(average>=65){
			System.out.println("Grade : B");
		}else if(average>=55){
			System.out.println("Grade : C");
		}else if(average>=35){
			System.out.println("Grade : S");
		}else if(average>0){
			System.out.println("Better luck next time");
		}else{
			System.out.println("Invalid range");
		};
	}
}