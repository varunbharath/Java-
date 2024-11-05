package ifconditions;

import java.util.Scanner;

public class IfElse_Practice {
	void main() {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the marks");
		int mark=x.nextInt();
		
		if(mark>50&&mark<60) {
			System.out.println("GradeE");
		}
		else if(mark>=60&&mark<70) {
			System.out.println("GradeD");
		}	
		else if(mark>=70&&mark<80) {
			System.out.println("Gradec");
		}
		else if(mark>=80&&mark<90) {
			System.out.println("Grade B");
		}
		else	if(mark>=90&&mark<100) {
			System.out.println("GradeA");
		}
		else {
			System.out.println("Statement False");
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfElse_Practice obj=new IfElse_Practice();
		obj.main();
		

	}

}
