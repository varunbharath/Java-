package dryprogam;

import java.util.NoSuchElementException;

public class NewProgramm2 {
	void ok() throws NoSuchElementException {
		try {
	 int a=90;
	int b=0%a;
	System.out.println(b);
		}
			catch(Exception e) {
				System.out.println("failed"+e);
				throw new RuntimeException();
			}
		
	finally { 
		System.out.println("pass or fail i will executed");
	}
	}
	
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewProgramm2 obj=new NewProgramm2();
		
obj.ok();
	}

}
