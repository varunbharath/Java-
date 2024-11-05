package thismethod;

public class Thismethod {
	
	 void smethod() {
		 System.out.println("Thismethod output");
	 }
void display() {
	System.out.println("displayvalue is 45678");
}
void employeevalue() {
	System.out.println("Employeevalueis 89%");
	
}
	 void add() {
		 
		 System.out.println("valuwe1");
		 System.out.println("value2");
		 this.smethod();
		this. display();
		this.employeevalue();
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Thismethod obj=new Thismethod();
  obj.add();
  
	}

}
