import java.util.Scanner;

class UserInput{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name=scanner.nextln();		
		
		System.out.print("Enter your marks: ");
		int marks=scanner.nextInt();
		
		System.out.println("Entered name is: "+name);
		System.out.println("Entered marks is: "+marks);
	}
}