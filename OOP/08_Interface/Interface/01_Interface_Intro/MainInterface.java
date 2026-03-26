class MainInterface{
	public static void main(String args[]){
		B objB=new B();
		objB.getX();
		objB.getY();
		//objB.X=25;// to check final variable
		System.out.println("AX: "+IA.X); // to check static variable
	}
}