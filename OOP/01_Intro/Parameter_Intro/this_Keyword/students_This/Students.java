class Students{
	int id;
	String name;
	
	void setStudent(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	void getStudent(){
		System.out.println("Student id is: "+this.id);
		System.out.println("Student name is: "+this.name);
	}
}