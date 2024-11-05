package dryprogam;

public class Tryprogramm {
	static int  a=20;
	static void range() {
		System.out.println(a);
		a=30;
		System.out.println(a);
	}
	 static void student_marks(int l1, int l2,int science, int phy, int che, int mat, int cuttoff) {
		if (mat>90 || phy>89 ) {
			System.out.println("true statement");
		}
		else if (phy>90 && l1<80) {
			System.out.println("try statement");
			
		}
		else if (che>= science) {
			System.out.println("che");
			
		}
		else{
			System.out.println("failed");
		}
			
	}
	static void try1() {
		 int a1=0;
		 while(a1<=100) {
		 
		 System.out.println(a1);
		 a1=a1+3;
		 System.out.println(a1);
		 
		 }
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		range();
		
		student_marks(56, 78, 89, 57, 98, 78, 168);
		try1();

	}

}
