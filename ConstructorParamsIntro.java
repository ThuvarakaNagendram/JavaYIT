class ConstructorParamsIntro{
	int id;
	String name;
	
	ConstructorParamsIntro(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	void getStudent(){
		System.out.println("This is ur id: "+id);
		System.out.println("This is ur name: "+name);
	}
}