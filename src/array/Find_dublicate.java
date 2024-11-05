package array;

public class Find_dublicate {
void dublicate() {
	int a[]= {10,20,30,10,20,50};
	for(int i =0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++){
		
			if(a[i]==a[j]) {
				System.out.println(a[i]);
			}
		}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Find_dublicate obj=new Find_dublicate();
obj.dublicate();
	}

}
