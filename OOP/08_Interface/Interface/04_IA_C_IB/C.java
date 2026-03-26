class C implements IB,IA{
	int z;
	
	C(){
		this.z=30;
	}
	
	void getZ(){
		System.out.println("Cz: "+this.z);
	}
	
	public void getY(){
		System.out.println("By: "+Y);
	}
	
	public void getX(){
		System.out.println("Ax: "+X);
	}
}