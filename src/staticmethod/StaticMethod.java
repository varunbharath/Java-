package staticmethod;

public class StaticMethod {
	int Rollno=676542;
	int Niccode= 764;
	int male=45678;
	int female=56788;
	
	static String state="Arizona";
	
	void add() {
		int sum=male+female;
		System.out.println("Sum of total members:"+male+female);
		
	}
	static void sub() {
		
		int aa=4566;
		int bb=6544;
		System.out.println("state value :"+state);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod obj=new StaticMethod();
sub();
obj.add();
	}

}
