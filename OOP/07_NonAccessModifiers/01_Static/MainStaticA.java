class MainStaticA{
	static int y=20;
	
	public static void main(String args[]){
		System.out.println("Static y is: "+y);
		/*//finding x using creating object
		A objA=new A();
		objA.getX();
		
		//finding x without creating object
		A.getX();
		*/
		A objA1= new A();
		objA1.getX();
		
		A objA2=new A();
		objA2.getX();
		
		objA1.x=30;
		objA1.getX();//30
		
		objA2.getX();//30
	}
}