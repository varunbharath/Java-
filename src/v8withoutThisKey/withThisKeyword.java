package v8withoutThisKey;

public class withThisKeyword {
	String StudentName;
	int Lang1;
	int Lang2;
	int Mat;
	int che;
	int phy;
	int bio;
	
	void Student1(String StudentName, int Lang1,int Lang2, int Mat, int che,int phy ,int bio) {
		this.StudentName=StudentName;
		this.Lang1=Lang1;
		this.Lang2=Lang2;
		this.Mat=Mat;
		this.che=che;
		this.phy=phy;
		this.bio=bio;
		String Toatalmarks=StudentName+Lang1+Lang2+Mat+che+phy+bio;
		System.out.println("Student1Details1:"+StudentName+Lang1+Lang2+Mat+phy+che+bio);
		System.out.println("Toatal marks for Student1"+Toatalmarks);
	}
	 void Student2() {
		  System.out.println("StudentDetilas2"+StudentName+Lang1+Lang2+Mat+phy+che+bio);
	 }
	 void Student3() {
		  System.out.println("StudentDetilas3"+StudentName+Lang1+Lang2+Mat+phy+che+bio);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		withThisKeyword obj=new withThisKeyword();
		obj.Student1("BHARATH", 198, 178, 189, 179, 194, 197);
		obj.Student2();
		obj.Student3();

	}

}
