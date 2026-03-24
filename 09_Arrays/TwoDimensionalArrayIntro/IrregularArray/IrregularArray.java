class IrregularArray{
	public static void main(String args[]){
		int [][] irregularArray=new int [5][];
		irregularArray[0]=new int[2];
		irregularArray[1]=new int[3];
		irregularArray[2]=new int[4];
		irregularArray[3]=new int[5];
		irregularArray[4]=new int[6];
		
		irregularArray[0][0]=00;
		irregularArray[0][1]=01;
		
		irregularArray[1][0]=10;
		irregularArray[1][1]=11;
		irregularArray[1][2]=12;
		
		irregularArray[2][0]=20;
		irregularArray[2][1]=21;
		irregularArray[2][2]=22;
		irregularArray[2][3]=23;
		
		irregularArray[3][0]=30;
		irregularArray[3][1]=31;
		irregularArray[3][2]=32;
		irregularArray[3][3]=33;		
		irregularArray[3][4]=34;
		
		irregularArray[4][0]=40;
		irregularArray[4][1]=41;
		irregularArray[4][2]=42;
		irregularArray[4][3]=43;
		irregularArray[4][4]=44;		
		irregularArray[4][5]=45;
		
		for (int i = 0; i < irregularArray.length; i++) {
            for (int j = 0; j < irregularArray[i].length; j++)
                System.out.print(irregularArray[i][j] + " ");
            System.out.println();
        }
	}
}