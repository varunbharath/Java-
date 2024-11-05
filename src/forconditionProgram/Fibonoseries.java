package forconditionProgram;


public class Fibonoseries {
	void main() {
	int num;
	int a=0;
	int b=1;
	
	//Scanner x=new Scanner(System.in);
System.out.println(a);
System.out.println(b);

	for(int i =0;i<5;i++) {
		num=a+b;
		a=b;
		b=num;
		System.out.println("Printthevalue"+num);
		
	}
	
	
	}
	public static void main(String args[]) {
		Fibonoseries obj=new Fibonoseries();
		obj.main();
		
	}
		

}

