class A{
	int x;
	A(int x){
		this.x=x;
	}
	
	void getX(){
		System.out.println("Ax: "+this.x);
	}
}

class B extends A{
	int y;
	B(int x,int y){
		super(x);
		this.y=y;
	}
	void getY(){
		System.out.println("By: "+this.y);
	}
}

class C extends B{
	int z;
	C(int x, int y, int z){
		super(x,y);
		this.z=z;
	}
	void getZ(){
		System.out.println("Cz: "+this.z);
	}
}

class MultiInheritanceParameterized{
	public static void main(String args[]){
		C objC=new C(10,20,30);
		objC.getX();
		objC.getY();
		objC.getZ();
		
	}
}