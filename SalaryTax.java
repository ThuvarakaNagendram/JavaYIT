class SalaryTax{
	public static void main(String args[]){
		int emplyeeSalary=120000;
		double netSalary;
		double tax;
		
		if(emplyeeSalary>=100000){
			tax=emplyeeSalary*0.05;
		}else{
			tax=emplyeeSalary*0.03;
		}
		netSalary=emplyeeSalary-tax;
		
		System.out.println("Your tax is: "+tax);
		System.out.println("Your netSalary is: "+netSalary);
	}
}