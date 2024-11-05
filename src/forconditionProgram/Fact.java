package forconditionProgram;

public class Fact {
	
	 static int num =5;	
	 
	static int fact=0;
	void age() {
		
			for (int i=4;i>0;i--) {
					
		
		fact=num*i;
		//fact=5*4
		num=fact;  
		//num=20;
		//i--
	
				
		System.out.println(fact);
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fact  obj=new Fact();
obj.age();

	}

}
