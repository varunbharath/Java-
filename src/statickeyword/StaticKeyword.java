package statickeyword;

public class StaticKeyword {

	int a=50;
	  int b=190;
	static int c=1056;
	static String co="1840CA00";
	//static String co="QCA00";
	static   int tockenno=1000100;
	void quoteid() {
		++a;
		a++;
		a++;
		a++;
		b++;
		b++;
		b++;
		c++;
		c++;
		c++;
		c++;
		String value=co+c;
		
		tockenno ++;
		tockenno ++;
		tockenno ++;
		System.out.println("a quoteid value is Today :"+a);
		System.out.println("b quoteid value is Today :"+b);
		System.out.println("c quoteid value is 18400"+ c);
		System.out.println("Tocken number is :"+tockenno);
		System.out.println("Quote id value"+co+c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKeyword obj=new StaticKeyword();
		
		obj.quoteid();
		
		StaticKeyword obj1= new StaticKeyword();
		
		obj1.quoteid();
		
		StaticKeyword obj2=new StaticKeyword();
		obj2.quoteid();
		StaticKeyword obj3=new StaticKeyword();
		obj3.quoteid();

	}

}
