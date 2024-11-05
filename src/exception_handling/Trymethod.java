package exception_handling;

public class Trymethod {
	void mrthod() {
		try {
		int	actualvalue=73;
		int Expectedvalue=actualvalue%0  ;
		 System.out.println("print"+Expectedvalue);
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("failed"+e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Trymethod obj=new Trymethod();
obj.mrthod();
	}

}
