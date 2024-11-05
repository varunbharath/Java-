package ifconditions;

import java.util.Iterator;

public class Oddnumber {
	void add() {
		//even number programm
		
		for(int i =0;i<100;i++) {
			if (i%2==0) {
			System.out.println("value with even"+i);
			
			
			}}
	
	
// odd number program
		for(int i =0;i<100;i++) 
		{
		if(i%2!=0) {
			System.out.println("value without odd"+i);
		}
			
		}
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oddnumber obj=new Oddnumber();
		obj.add();

	}

}
