package v5defaultconstructor;

public class Defaultconstructor {
	
	Defaultconstructor(){
		String id="VAM6811";
		String Name ="Hari";
		String Role="Software_Developer";
		String Testerdetails1=id+Name+Role;
		System.out.println("Details of employee");
		System.out.println("Details"+Testerdetails1);
	}
		void Employee_Details() {
		String id="VAM6822";
		String Name ="Bharath";
		String Role="Software_tester";
		String Testerdetails=id+Name+Role;
				
			System.out.println("Details"+Testerdetails);
		}
		
		void  Employee_Salary() {
			String id="VAM6822";
			int Salary=89000;
			String Employee_grade=id+Salary;
			System.out.println("Employeesalary_details"+id+Salary+Employee_grade);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Defaultconstructor obj= new Defaultconstructor();
		obj.Employee_Details();
		obj.Employee_Salary();
		
		

	}

}
