package interfacetoclass;


public class HDFC_interfacetoclass implements RBIInterfacetoclass{
	public void personal_loan() {
		 System.out.println("Personal loan interest 12.5%");
		 System.currentTimeMillis();
	 }
	 public void vehicle_loan() {
		 System.out.println("vehicleloan interest 8.5%");
	 }
	 void mail() {
		 System.out.println("Common interest");
	 }
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC_interfacetoclass obj=new HDFC_interfacetoclass();
		obj.personal_loan();
		obj.vehicle_loan();
		obj.mail();

	}

}
