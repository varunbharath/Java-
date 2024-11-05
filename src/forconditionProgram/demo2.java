package forconditionProgram;

public class demo2 {
static void main () {
	int a[]= {8,5,8,9,3,5,7};
	for(int i=0;i<a.length;i++) {
		for (int j=1;j<a.length;j++) {
			if(a[i]==a[j]) {
				System.out.println("Dublicate value"+a[i]);
			}
			
		}
	}
	
	
}
public static void main(String args[]) {
	main();
}

}
