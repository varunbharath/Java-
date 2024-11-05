package exception_handling;

public class Finallywithout {

	void display() {
		try {
			int	a=73;
			int b=a%5 ;
			 System.out.println("print"+b);
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("failed"+e);
			}
			finally {
				System.out.println("condition pass");
			}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Finallywithout obj=new Finallywithout();
			obj.display();
}}