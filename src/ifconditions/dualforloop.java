package ifconditions;

public class dualforloop {

	void age() {
		for(int i=0;i<5;i++) {
			for(int j=1;j<5;j++) {
				System.out.println(i);
				System.out.println(j);
			}
			System.out.println(i+"I value ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dualforloop obj=new dualforloop();
		obj.age();
		
		

	}

}
