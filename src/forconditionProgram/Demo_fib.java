package forconditionProgram;

import java.util.Scanner;

public class Demo_fib {
	
	void demo() {
		int num;
		int a=0;
		int b=1;
		 Scanner n=  new Scanner(System.in);
		 System.out.println();
		 num=n.nextInt();
		 int nextterm;
		 for(int i=2;i<num;i++) {
			 nextterm =a+b;
			 a=b;
			 b=nextterm;
			 System.out.println(nextterm);
			 
		 }
	}
public static void main(String args[]) {
	Demo_fib obj=new Demo_fib();
	obj.demo();
}
}
