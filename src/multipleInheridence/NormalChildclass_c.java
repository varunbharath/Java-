package multipleInheridence;

public class NormalChildclass_c implements Interface_Amazon, Interface_B{
	 
	
	 public void login() {
		System.out.println("Login = 123455@gmail.com");
	}
	//abstract void a1_properties();
	 public void username() {
		 System.out.println("username=bharth");
	}
	 public void ProductSearch() {
		 System.out.println("Search Electronic");
	 }
	

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NormalChildclass_c obj= new NormalChildclass_c();
	obj.login();
	obj.username();
	obj.ProductSearch();
		
		
	}

}
