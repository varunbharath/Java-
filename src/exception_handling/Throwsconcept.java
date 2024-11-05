package exception_handling;

public class Throwsconcept {
	void display() throws ArithmeticException,NullPointerException,ArrayStoreException{
		
		
		int	actualvalue=108;
		int Expectedvalue=actualvalue%0  ;
		 System.out.println("print"+Expectedvalue);
			
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Throwsconcept obj=new Throwsconcept();
obj.display();
	}

}
