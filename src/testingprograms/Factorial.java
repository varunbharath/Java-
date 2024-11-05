package testingprograms;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=5;
		int fact=number;
		while (number>1) {
			number--;
			fact=fact*number;
		}
System.out.print(fact);
	}

}
