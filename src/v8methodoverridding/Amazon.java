package v8methodoverridding;

public class Amazon {
	
	void Login (String User, String Password) {
		System.out.println("Amazonlogin"+User+Password);
	}
	
//public class Amazonprime{
//	void Login(String User, String Password) {
	//	System.out.println("AmazonPrimelogin"+User+Password);
		
	//}
		
	//}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Amazon obj= new Amazon();
	//obj.Login("bharath","1234567");
		
	AmazonPrime obj1 =new AmazonPrime();
	obj1.Login("bharath","1234567"); 
	
		
		
		
		

	}

}
