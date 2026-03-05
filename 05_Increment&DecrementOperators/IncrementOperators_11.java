class IncrementOperators_11{
	public static void main(String args[]){
		int x=10;
		System.out.println(x);//10
		
		x=x+1;
		System.out.println("x+1:"+x);//11
		
		x+=1;
		System.out.println("x+:"+x);//12
		
		x++;									//post increment
		System.out.println("x++:"+x);//13
		
		++x;									//pre increment
		System.out.println("++x:"+x); //14
		
		System.out.println(++x);//15
		System.out.println(x++);//15
		System.out.println(x);//16
	}
}