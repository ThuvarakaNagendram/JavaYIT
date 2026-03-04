class Employee{
	int id;
	String name;
	double basicSalary;
	double bonus;
	double netSalary;
	
	void setEmployee(int id, String name, double basicSalary){
		/*
		id=ids;
		name=names;
		basicSalary=salaries;
		*/
		
		/*
		id=id;
		name=name;
		basicSalary=basicSalary;
		*/
		this.id=id;//this variable only used for instance variable, if we use this it will search in class
		//this.id=this.ids;//wrong because when we use this here it will search for ids in class file not in arguments 
		this.name=name;
		this.basicSalary=basicSalary;
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
		System.out.println("Salary details for: "+this.name);
		System.out.println("Your id is: "+this.id);
		System.out.println("Your name is: "+this.name);
		System.out.println("Your basic salary is: "+this.basicSalary);
		System.out.println("Your bonus is: "+this.bonus);
		System.out.println("Your net salary is: "+this.netSalary);
		System.out.println("**********************************");
	}
}