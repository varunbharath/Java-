package collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Set_String_Program {
	void exampleprogram() {
	Set<String>  name= new HashSet<String>();
	//	TreeSet<String> name=new TreeSet<String>();
	name.add(null);
	name.add(null);
	name.add("HI");
	name.add("Hello");
	name.add("All employee");
	name.add("HI");
	
	System.out.println("name variable display"+name);
	Iterator<String> allnames= name.iterator();
	while (allnames.hasNext()) {
		
		System.out.println(allnames.next());
		//throw new NullPointerException("shown error");
	}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set_String_Program obj=new Set_String_Program();
		obj.exampleprogram();

	}

}
