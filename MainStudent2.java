class MainStudent2{
	public static void main(String args[]){
		Student2 student1=new Student2(1,"Ammu");
		//student1.setStudent(1,"Ammu");
		student1.setMarks(98,87,79);
		student1.display();
		
		Student2 student2=new Student2(2,"Pommu");
		//student2.setStudent(2,"Pommu");
		student2.setMarks(97,89,81);
		student2.display();
		
		Student2 student3=new Student2(3,"Athee");
		//student3.setStudent(3,"Athee");
		student3.setMarks(87,68,81);
		student3.display();
	}
}