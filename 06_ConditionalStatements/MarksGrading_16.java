class MarksGrading_16{
	public static void main (String args[]){
		int marks=30;
		if(marks>=75 && marks<=100){
			System.out.println("Your grade is A");
		}else if(marks<75 && marks>=65){
			System.out.println("Your grade is B");
		}else if(marks<65 && marks>=55){
			System.out.println("Your grade ic C");
		}else if(marks<55 && marks>=35){
			System.out.println("Your grade is S");
		}else{
			System.out.println("Noworries better luck next time...");
		}
	}
}