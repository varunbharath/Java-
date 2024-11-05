package testprogram1;

public class TestProgram {
	

	//  welcome datails
	
  TestProgram(String offer) {
	  System.out.println("welcome to Amazon");
		System.out.println("Today Amazon Offer is:"+offer);
		
	}
	// login details
  void logindtails(String Username, String Password, String Enterthecaptcha) {
	  System.out.println("logindetails:"+Username+Password+Enterthecaptcha);
  }
  // card payment details
void Cardpayments(float cardnumber,double mobilenumber,int DOB, int CVV, int otp) {
	
	System.out.println("Cardpayments details:"+cardnumber+mobilenumber+DOB+CVV+otp);
	
	
}
// gpay payment
void gpay(String entryPassword, int Amount, String Password) {
	
	System.out.println("Gpay payment:"+entryPassword+Amount+Password);
	
}

	
	void RegisterUserdetails ( String Name, String Password, String Emailid, String ConfirmPassword,int mobilenumber){
		
		System.out.println("Register details for customer1"+Name+Password+Emailid+ConfirmPassword+mobilenumber);
		
				
	}
	
	void getUserdetails() {
		
		//String details=salary+"qa"+members+level;
	
		System.out.println("details");
	
		this.RegisterUserdetails("Bharath","123455678@","1234@gmail.com","123455678@",1234455);
		this.logindtails("Bharath","P@ssw0rd@123","ThP678K");
		this.Cardpayments(7788112233445566f, 8899776655d, 8101998, 765, 887799);
		this.gpay("P@ssw0rd",100000,"2020");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestProgram obj=new TestProgram("10%");
obj.getUserdetails();


	}

}
