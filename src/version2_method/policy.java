package version2_method;

public class policy {
	
	int a=10;
	int b=20;
	
	void quoteid() {
		
		String policyholder="Ajay";
		String id= "VAM6822";
		int Age=25;
		String ajaydetails= policyholder+id+Age;
		System.out.println(ajaydetails+"Ajay Quote details");
		int c= a+b;
		System.out.println(c);
		
	}
	
	
	void logindetails() {
		String name ="Ajay1";
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		policy obj=new policy();
		
		obj.quoteid();
		obj.logindetails();
	}

}
