class Employee{
	int id;
	String name;
	double basicSalary;
	double bonus;
	double netSalary;
	
	void setEmployee(int ids, String names, double salaries){
		id=ids;
		name=names;
		basicSalary=salaries;
	}
	
	void calcBonus(){
		if (basicSalary<=300000 && basicSalary>0){
			bonus=basicSalary*0.03;
		}else{
			bonus=basicSalary*0.05;
		}
		netSalary=basicSalary+bonus;
	}
	
	void display(){
		System.out.println("Salary details for: "+name);
		System.out.println("Your id is: "+id);
		System.out.println("Your name is: "+name);
		System.out.println("Your basic salary is: "+basicSalary);
		System.out.println("Your bonus is: "+bonus);
		System.out.println("Your net salary is: "+netSalary);
		System.out.println("**********************************");
	}
}