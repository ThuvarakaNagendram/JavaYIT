class ConstructorParameterized{
	int id;
	String name;
	
	ConstructorParameterized(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	void getStudent(){
		System.out.println("This is ur id: "+id);
		System.out.println("This is ur name: "+name);
	}
}