package interface_test;

public class StateBank extends ICCI implements RBI {// normal class
	public void Gold_loan() {
		System.out.println("Gold Loan Percentage 7.25%");
	}
	
	public void  Home_loan() {
		System.out.println("Homeloan Percentage 11.45%");	
		
	}
	public void educationloan() {
		System.out.println("education loan percentage 17.9");
	}
	
	void  ICCICurrent_CarLoan() {
		System.out.println("Carloan Percentage 13.35%");	
	}
	
void value() {
	System.out.println("value of the range ");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StateBank obj=new StateBank();
		obj.Gold_loan();
		obj.Home_loan();
		obj.IccI_percentage();
		obj.educationloan();
		obj.value();

	}

}
