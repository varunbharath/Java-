import java.util.Scanner;

public class switchcase {
	void Employee() {
		//Scanner x=new Scanner(System.in);// 2nd type
		System.out.println("Enter the Employees Details");
	//int List	=x.nextInt();// 2nd type
		int List=6;// one type
	switch(List)
	{
	case 1:
		System.out.println("VAM 6811");
		break;
	
	case 2:
		System.out.println("VAM 6812");
		break;
	
case 3:
	System.out.println("VAM 6813");
	break;

case 4:
	System.out.println("VAM 6814");
	break;

case 5:
	System.out.println("VAM 6815");
	break;
case 6:
	System.out.println("VAM 6816");
	break;
	default :
		System.out.println("Details not there here");
}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switchcase obj= new switchcase();
		obj.Employee();

	}

}
