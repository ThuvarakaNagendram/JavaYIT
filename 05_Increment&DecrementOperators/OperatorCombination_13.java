class OperatorCombination_13{
	public static void main (String args[]){
		int a =10;
		int b =3;
		int c =5;
		
		a=b++ + c++;
		System.out.println("a:"+a); //8
		System.out.println("b:"+b); //4
		System.out.println("c:"+c); //6
		
		c=b=a; //c=b=a=8
		System.out.println("a:"+a); //8
		System.out.println("b:"+b); //8
		System.out.println("c:"+c); //8
		
		b=a-- + --b - c++;
		System.out.println("a:"+a); //7
		System.out.println("b:"+b); //7
		System.out.println("c:"+c); //9	
	}
}