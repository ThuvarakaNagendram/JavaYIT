import java.util.Scanner;

class SimpleCalculator{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		double result;
		
		System.out.print("Enter first number: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scan.nextDouble();
		
		System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
		
		System.out.print("Enter your choice (1-4): ");
        int choice = scan.nextInt();
		
		switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Addition: " + result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println("Substraction: " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println("Multiplication: " + result);
                break;

            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Devision: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }
		scan.close();
	}
}