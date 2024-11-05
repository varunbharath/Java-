package collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_integer_program {
	static void xample() {
	
	Set<Integer> name=new HashSet<Integer>();
	name.add(null);
	name.add(null);
	name.add(8);
	name.add(16);
	name.add(37);
	name.add(null);
	name.add(8);
	 System.out.println("Print name values"+ name);
	 Iterator<Integer> allnames= name.iterator();
	 while(allnames.hasNext()) {
	 System.out.println(allnames.next());}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set_integer_program obj=new Set_integer_program();
		xample();

	}

}
