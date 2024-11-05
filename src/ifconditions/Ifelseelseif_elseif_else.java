package ifconditions;

public class Ifelseelseif_elseif_else {
/*	static int age1=20;
	static int age2=25;
	static int age3=35;
	static int Weight1=30;
	static int Weight2=70;
	static int weight3=85; */
	
	void ageStudent(int age1,int  age2, int age3,
	 int Weight1,
	int Weight2,
	int weight3)
	{
		if (age1<=20&&Weight1<=60) {
			System.out.println("Statement1+ true");
		}
		else if (age2<25&&Weight2<70) {
			System.out.println("Statement2 true");
		}
		else if (age3<35&&weight3<85) {
			System.out.println("Statement3 true");
		}
		else {
			System.out.println("Statement false");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ifelseelseif_elseif_else obj=new  Ifelseelseif_elseif_else();
		obj.ageStudent(20,25,35,30,70,85);
				

	}

}
