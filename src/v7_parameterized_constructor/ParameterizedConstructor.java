package v7_parameterized_constructor;


public class ParameterizedConstructor {
	int a=10;
	int b=78;
	 ParameterizedConstructor(int a,int b,String name, String ID) {
		 int h = a+b;
		 System.out.println("h value:"+h);
		// ;l
		 
		 System.out.println("details of the student:"+ a+  b+  name +  ID);
		
	}
	 
	 void howntown() {
		 String Door_No="5-4-4-A";
		 String Street_Name= "MainRoad";
		 String City="Coimbatore";
		 String xx_Details= Door_No+City+Street_Name;
		 System.out.println("Details of the xx person :"+xx_Details);
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstructor obj= new ParameterizedConstructor(289,345678 ," Bharath","VAM6822");
obj.howntown();
	}

}
