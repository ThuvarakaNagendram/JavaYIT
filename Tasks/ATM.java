import java.util.Scanner;

import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double balance = 10000;
        int choice;
        char cont = 'y';
        
        while (cont == 'y' || cont == 'Y') {
            
            System.out.println("\nATM MENU");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.print("Choose option: ");
            
            choice = scan.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + balance);
                    break;
                    
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = scan.nextDouble();
                    balance += deposit;
                    System.out.println("Updated Balance: " + balance);
                    break;
                    
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = scan.nextDouble();
                    
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Updated Balance: " + balance);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;
                    
                default:
                    System.out.println("Invalid option!");
            }
            
            System.out.print("Do you want another operation? (y/n): ");
            cont = scan.next().charAt(0);
        }
        
        System.out.println("Thank you! Have a nice day.");        
    }
}