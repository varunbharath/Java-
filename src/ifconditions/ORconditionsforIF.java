package ifconditions;

public class ORconditionsforIF {
	static int marks=93;
	static int cutoff=190;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(marks>94||cutoff>190) {
			System.out.println( marks+"Eligible to counsling");
			System.out.println( cutoff+"Eligible to counsling");
		}
		else
		{
			System.out.println(marks+"Not Eligible to counsling");
			System.out.println( cutoff+" Not Eligible to counsling");
		}
	}

}
