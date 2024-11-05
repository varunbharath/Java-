package ifconditions;

public class ifeleseifcondition {
	static int marks=95;
	static int cutoff=199;
	void student() {

		if(marks>94) {
			System.out.println( marks+"Eligible to counsling");
			//System.out.println( cutoff+"Eligible to counsling");
		}
		else if 	(cutoff>=190) {
			System.out.println( cutoff+"Eligible to counsling");
			
		}
			
		else
		{
			System.out.println(marks+"Not Eligible to counsling");
			System.out.println( cutoff+" Not Eligible to counsling");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ifeleseifcondition  obj=new ifeleseifcondition();
		obj.student();

	}

}
