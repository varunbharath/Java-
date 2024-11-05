package sample2;

public class Sample2 {
	Sample2(){
		System.out.println("Sample");
	
	}
	Sample2(int a,int b){
		System.out.println("Sample2value:"+a+b);
		
	
	}
	
	Sample2(int a, int b,int c){
		System.out.println("Sample2valuefor:"+a+b+c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 obj=new Sample2();
		Sample2 obj1=new Sample2(22,89);
		Sample2 obj2=new Sample2(98,100,98);

	}

}
