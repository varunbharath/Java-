package exception_handling;

public class ThrowClassPractice {
static int a=10;
static int b=0;
void mail() {
	int c=a+b;
	System.out.println("cvalue is "+ "  "+c);
}
void with() throws ArithmeticException,NoSuchFieldException{}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowClassPractice obj=new  ThrowClassPractice();
	obj.run();	
	
	}
	void run() {
  this.mail();
	int d= a-b;
	try {
		int e=a%b;
		System.out.println(e);
	} catch (Exception e) {
		// TODO Auto-generated catch block
	System.out.println("shown some error, so check the condition ");
	throw new RuntimeException();
	}
}}
