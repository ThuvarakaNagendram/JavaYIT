class MainPen{
	public static void main(String args[]){
		Pen P;//declaration
		P=new Pen();//initialization. here Pen is a data type which was created by user-userDefined
		P.madeIn="Japan";
		P.colour="blue";
		P.brand="Atlas";
		P.weight=10;
		P.height=10;
		P.write();
	}
}

