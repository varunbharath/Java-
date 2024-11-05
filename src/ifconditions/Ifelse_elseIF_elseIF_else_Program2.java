package ifconditions;

public class Ifelse_elseIF_elseIF_else_Program2 {
	
void studentgrade(int Marks1,int Marks2,int Marks3,int Marks4,int Marks5, int Marks6,int Marks7) {
	if(Marks1>=50||Marks2<60) {
		System.out.println("GradeD");
	}
	else if(Marks2>=60&&Marks3<=70) {
		System.out.println("Grade c");
		
	}
	else if (Marks4>=70&&Marks5<80) {
		
		System.out.println("Grade B");
	}
	else if (Marks5>=80&&Marks6<90) {
		System.out.println("Grade A");
	}
	else if (Marks6>=90&&Marks7<100)
	{
		System.out.println("Grade S");
		}
	
	
	else {
		System.out.println("StatementFalse");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ifelse_elseIF_elseIF_else_Program2 obj=new Ifelse_elseIF_elseIF_else_Program2();
		obj.studentgrade(55, 100, 178, 12, 79,93,95);

	}

}
