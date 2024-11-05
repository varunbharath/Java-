package dowhile;

public class Dowhile {
static int  b=2;
void main() {
	int a=1;
	do {
		System.out.println(a+"x"+b+"="+(a*b));
		a++;
	}
	while(a<=10);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dowhile obj=new Dowhile();
		obj.main();

	}

}
