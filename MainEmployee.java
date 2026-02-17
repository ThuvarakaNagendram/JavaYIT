class MainEmployee{
	public static void main(String args[]){
		Employee employee1=new Employee();
		employee1.setEmployee(1,"Ammu",400000);
		employee1.calcBonus();
		employee1.display();
		
		Employee employee2=new Employee();
		employee2.setEmployee(2,"Pommu",300000);
		employee2.calcBonus();
		employee2.display();
		
		Employee employee3=new Employee();
		employee3.setEmployee(3,"Athee",200000);
		employee3.calcBonus();
		employee3.display();
	}
	
}