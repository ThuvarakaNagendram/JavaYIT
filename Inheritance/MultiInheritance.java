class A{
	int x;
	A(){
		this.x=10;
	}
	
	void getX(){
		System.out.println("Ax: "+this.x);
	}
}

class B extends A{
	int y;
	B(){
		this.y=20;
	}
	void getY(){
		System.out.println("By: "+this.y);
	}
}

class C extends B{
	int z;
	C(){
		this.z=30;
	}
	void getZ(){
		System.out.println("Cz: "+this.z);
	}
}

class MultiInheritance{
	public static void main(String args[]){
		C objC=new C();
		objC.getX();
		objC.getY();
		objC.getZ();
		
	}
}