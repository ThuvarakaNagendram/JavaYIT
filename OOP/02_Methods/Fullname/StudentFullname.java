class StudentFullname{
	int id;
	String fName;
	String lName;
	
	void setStudent(int id, String fName, String lName){
		this.id=id;
		this.fName=fName;
		this.lName=lName;
	}//4
	/*
	void getFullname(){
		String fullName=this.fName+" "+this.lName;
	}*/
	
	String getFullname(){//17
		String fullName=this.fName+" "+this.lName;
		return fullName;
	}
	
	void display(){
		System.out.println("Your id is "+id);
		System.out.println("Your first name is "+fName);
		System.out.println("Your last name is "+lName);
		String fullNames=this.getFullname();//16
		System.out.println("Your full name is "+fullNames);
		//System.out.println("Your full name is"+getStudent.fullName);
	}
}

















//inheritance nadakekka 