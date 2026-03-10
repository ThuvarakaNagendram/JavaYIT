class MainStudentGrading{
	public static void main(String args[]){
		StudentGrading student1=new StudentGrading();
		student1.setStudent(1,"Ammu");
		student1.setMarks(98,87,79);
		student1.display();
		
		StudentGrading student2=new StudentGrading();
		student2.setStudent(2,"Pommu");
		student2.setMarks(97,89,81);
		student2.display();
		
		StudentGrading student3=new StudentGrading();
		student3.setStudent(3,"Athee");
		student3.setMarks(87,68,81);
		student3.display();
	}
}