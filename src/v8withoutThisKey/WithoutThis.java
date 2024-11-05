package v8withoutThisKey;

public class WithoutThis {
	String  CompanyName;
	int      Toatalemployee;
	
	void Totalemployee(String CompanyName, int Toatalemployee ) {
		CompanyName= CompanyName;
			Toatalemployee=Toatalemployee;
				System.out.println(CompanyName);
				System.out.println (Toatalemployee);
	}
 
	void details() {
		System.out.println(CompanyName+Toatalemployee);
	}
	

	public static void main(String[] args) {
		{
	
		// TODO Auto-generated method stub
WithoutThis obj= new WithoutThis();
obj.Totalemployee("VAM", 234567);
obj.details();

	
	}
	}}

