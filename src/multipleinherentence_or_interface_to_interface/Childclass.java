package multipleinherentence_or_interface_to_interface;

public class Childclass implements Interface_Amazon_prime{
	
	 public void login() {
		 System.out.print("Login details");
	 }
	 
	public void Signup() {
		 System.out.println("Signup Detais");
	 }
	 
public void product_status() {
	System.out.println(" Product Status for ready to despatch");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass obj= new Childclass();
		obj.login();
		obj.Signup();
		obj.product_status();
		
		

	}

}
