package staticblock;

public class StaticBlock {
	StaticBlock(String name,String  salary , String count) {
	  int  a=20;
	  int b=45;
	  int c=34;
	  int d=a+b+c;
	  System.out.println("Stringblock value"+name+salary+count);
	  System.out.println("d value is "+d);
	}
	
	static{
		System.out.println("System print Static word");
	}
	void add() {
		System.out.println("Additional of two values");
	}
	
	static {
		System.out.println("Firstexecution ?");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StaticBlock obj=new StaticBlock("bharath","100000L","A4");
	obj.add();
		

	}

}
