class DecrementOperators{
	public static void main (String args[]){
		int y =15;
		y=y-5;
		System.out.println("y-5:"+y);  //10
		
		y-=5;
		System.out.println("y-=5:"+y); //5
		
		y--;
		System.out.println("y--:"+y); //4
		
		--y;
		System.out.println("--y:"+y); //3
		
		System.out.println("--y:"+--y);  //2
		
		System.out.println("y--:"+y--); //12
		
		System.out.println(y); //1
	
	}
}