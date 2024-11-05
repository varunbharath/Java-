 package array;

public class Array_concept {
	void arraycon() {
	int [] rollno=new int[5];
	rollno[0]=10;
	rollno[1]=20;
	rollno[2]=30;
	rollno[3]=40;
	rollno[4]=50;
	
	//rollno[5]=60;
	for(int i=0;i<rollno.length;i++) {
		System.out.println(rollno[i]);
	
	}
	
	}
	static void stringusingarray () {
		String []name={"Hi", "Hello","we"};
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_concept obj=new Array_concept();
		obj.arraycon();
		stringusingarray();
	}

}
