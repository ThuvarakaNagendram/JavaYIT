class Student{
	int id; //id and name are instant variable//4
	String name;
	/*
	void setStudent(int ids, String names){//ids and names are parameterized variable//6
		id=ids;//7
		name=names;//8
	}//9 */
	
	/*
	void setStudent(int id, String name){//ids and names are parameterized variable//6
		id=id;//7
		name=name;//8
	}//9 */
	
	void setStudent(int id, String name){//ids and names are parameterized variable//6
		this.id=id;
		this.name=name;
	}//9
	
	void getStudent(){//11
		System.out.println("Id is: "+id);//12
		System.out.println("Name is: "+name);//13
	}
}//14