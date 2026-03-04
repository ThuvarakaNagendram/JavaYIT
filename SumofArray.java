import java.util.Scanner;
public class SumofArray{
	public static void main(String args[]){
		
		Scanner scaner=new Scanner(System.in);
		int[] numbers=new int[5];
		int sum=0;
		
		System.out.println("Enter five numbers: ");
		
		for(int i=0;i<5;i++){
			numbers[i]=scaner.nextInt();
			sum=sum+numbers[i];
		}
		
		System.out.println("Sum of your array elements is: "+sum);
	}
}
