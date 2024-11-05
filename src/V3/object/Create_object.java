package V3.object;

public class Create_object {



		
		void quoteid() {
			String policyholder="Ajay";
			String id= "VAM6822";
			int Age=25;
			String ajaydetails= policyholder+id+Age;
			System.out.println(ajaydetails+"Ajay Quote details");
			
		}
		void logindetails() {
			String name ="Ajay1";
			System.out.println(name);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Create_object obj=new Create_object();
			
			obj.quoteid();
			obj.logindetails();
		}

	}
