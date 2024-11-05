package v7polymorphism;

public class V7Polymorphism {
	//int totalamount=89000;
	//int totalemployee=7800;
	//String MNCName="TATA";
	
	
	void EmployeeDetails(String Username, int id,String Grade) {
		//String MNCdatails= totalamount+totalemployee+MNCName+Username+id;
		//System.out.println("MNCDatails:"+MNCdatails);
		
		System.out.println("Emp details:"+ id+  Grade+ Username);
	}
	 void EmployeeDetails(String Username,String Grade) {
		 System.out.println("Employee Dtails:"+ Username+ Grade);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		V7Polymorphism obj=new V7Polymorphism();
		obj.EmployeeDetails("Bharath", 6822, "A3");
		
		obj.EmployeeDetails("Jeev", "VAM6833");

	}

}
