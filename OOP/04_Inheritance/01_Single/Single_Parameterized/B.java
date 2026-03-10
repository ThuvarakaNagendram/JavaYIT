class B extends A{
	int y;
	B(int x,int y){
		super(x);
		this.y=y;
	}
	void getY(){
		System.out.println("Value of y is: "+this.y);
	}
}