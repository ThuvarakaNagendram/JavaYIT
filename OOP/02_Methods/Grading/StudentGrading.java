class StudentGrading{
	int id;
	String name;
	int m1;
	int m2;
	int m3;
	
	/*StudentGrading(int id, String name){
		this.id=id;
		this.name=name;
	}*/
	
	void setStudent(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	void setMarks(int m1, int m2, int m3){
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	int calcTotal(){
		int total=m1+m2+m3;
		return total;
	}
	
	double calcAverage(int total){
		double average=total/3;
		return average;
	}
	
	char grade(double average){
		char result;
		if(average>=75 && average<=100){
			result='A';
		}else if(average<75 && average>=65){
			result='B';
		}else if(average<65 && average>=55){
			result='C';
		}else if(average<55 && average>=35){
			result='S';
		}else{
			result='W';
		};
		return result;
	}
	
	void display(){
		System.out.println("Your id is : "+this.id);
		System.out.println("Your name is : "+this.name);
		System.out.println("Your marks in order : "+this.m1+", "+this.m2+", "+this.m3);
		
		int total=this.calcTotal();
		System.out.println("Your total is: "+total);
		
		double average=this.calcAverage(total);
		System.out.println("Your average is: "+average);
		
		char grade=this.grade(average);
		System.out.println("Your grade is: "+grade);
		
		System.out.println("********************************");
	}
}
