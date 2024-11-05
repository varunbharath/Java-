package forconditionProgram;

public class FactorialProgram {
	static int  no=15;
	static  int tempvalue=0;
	void fact() {
		for(int i =14;i>0;i--) {
			
			tempvalue=no*i;
			//tempvalue=15*14;
			no=tempvalue;
		//no=15*14;
			//i--
			System.out.println(no);
			
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialProgram obj=new FactorialProgram();
		obj.fact();
		
		

	}

}
