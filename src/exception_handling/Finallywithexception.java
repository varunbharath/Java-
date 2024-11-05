package exception_handling;

import java.io.IOException;

public class Finallywithexception {
void division() {
	
		try {
		int	a=73;
		int b=a%0  ;
		 System.out.println("print"+b);
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("failed"+e);
		}
		finally {
			System.out.println("condition failed");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finallywithexception obj=new Finallywithexception();
		obj.division();

	}

}
