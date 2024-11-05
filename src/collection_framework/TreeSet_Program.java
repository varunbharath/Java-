package collection_framework;

//import java.util.HashSet;

import java.util.Iterator;
import java.util.*;

public class TreeSet_Program {
	
	 static void exampleprogram() {
	TreeSet<String>  name= new TreeSet<String>();
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
TreeSet_Program objProgram=new TreeSet_Program();
exampleprogram();
	}

}