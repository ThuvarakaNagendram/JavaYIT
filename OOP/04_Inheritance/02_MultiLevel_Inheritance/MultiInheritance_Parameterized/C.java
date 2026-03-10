class C extends B{
	int z;
	C(int z, int y, int x){
		super(x,y);
		this.z=z;
	}
	void getZ(){
		System.out.println("Cz: "+this.z);
	}
}