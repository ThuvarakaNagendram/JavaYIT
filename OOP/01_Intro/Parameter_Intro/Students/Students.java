class Students{
	int id;
	String name;
	
	void setStudent(int ids,String names){
		id=ids;
		name=names;
	}
	
	void getStudent(){
		System.out.println("Student id is: "+id);
		System.out.println("Student name is: "+name);
	}
}