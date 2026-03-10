package packB;
import packA.A;

public class B extends A{
	public int y;
	
	public B(int y,int x){
		super(x);
		this.y=y;
	}
	
	public void getY(){
		System.out.println("By: "+this.y);
	}
}