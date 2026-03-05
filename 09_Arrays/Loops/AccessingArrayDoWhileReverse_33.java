class AccessingArrayDoWhileReverse_33{
	public static void main(String args[]){
		int[] y={10,20,30,40,50};
		int i=y.length-1;
		do{
			System.out.println(y[i]);
			i--;
		}while(i>=0);
	}
}