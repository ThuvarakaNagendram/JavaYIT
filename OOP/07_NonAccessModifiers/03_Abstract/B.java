class B extends A{
	int y;
	
	B(){
		this.y=20;
	}
	
	void getY(){
		System.out.println("By is: "+this.y);
	}
	
	void getX(){//implementation-execution
		System.out.println("Ax is: "+this.x);
	}
	
}