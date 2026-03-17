class TwoDimensionalArrayIntro{
	public static void main(String args[]){
		int [][] twoD=new int [5][2];
		twoD[0][0]=00;
		twoD[0][1]=01;
		
		twoD[1][0]=10;
		twoD[1][1]=11;
		
		twoD[2][0]=20;
		twoD[2][1]=21;
		
		twoD[3][0]=30;
		twoD[3][1]=31;
		
		twoD[4][0]=40;
		twoD[4][1]=41;
		
		 for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }		
	}
}