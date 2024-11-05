package thismethod;

public class Thisconstructor {
	
	 Thisconstructor() {
		 this("bharath","MNC");
		// this("Valuemomentum");
		System.out.println("Default constructor"); 
		
	}
	 Thisconstructor(String Name, String MNCname){
		
		 System.out.print("Parameter constructor"+Name+MNCname);
		 
	 }
	// Thisconstructor( String vam){
		 
	//	 System.out.println("thirdmethod");
	// }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thisconstructor aa= new Thisconstructor();

	}

}
