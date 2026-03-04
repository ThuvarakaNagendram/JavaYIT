class A{
	int x;
	
	A(){
		this.x=10;
	}
	
	void getX(){
		System.out.println("Value of x is: "+this.x);
	}
}

class B extends A{
	int y;
	
	B(){
		this.y=7;
	}
	
	void getY(){
		System.out.println("Value of y is:"+this.y);
	}
	
	void sum(){
		int sums=this.x+this.y;
		System.out.println("x+y is: "+sums);
	}	
}

class InheritanceIntro{
	public static void main(String args[]){
		B objB=new B();
		objB.getX();
		objB.getY();
		objB.sum();
		
		//int sum=objB.x+objB.y;
		//System.out.println("x+y is: "+sum);
		
	}
}