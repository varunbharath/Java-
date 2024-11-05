package exception_handling;

public class Exception_handling {
void justry() {
	try {
		int a=40;
		int b=a/0;
		System.out.println("print b+b"+b);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("failed+"+e);
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Exception_handling obj=new Exception_handling();
obj.justry();
	}

}
