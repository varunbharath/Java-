package whileloop;

public class WhileTable {
	static int b =2;
	
	void Table() {
		int a=0;// initialize
		//while(1<=10){
		while (a<=10) {//condition
			//System.out.println(1+"X"+2+"="+(1*2));
			System.out.println(a+"X"+b+"="+(a*b));
			a++;// increment or decrementN
			//1++
			//2++
			//3++
			//4++
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileTable obj=new WhileTable();
		obj.Table();

	}

}
