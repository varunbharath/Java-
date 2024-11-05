package collection_framework;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_set_tryconcept {
	void range() { 
		TreeSet<String> v1= new TreeSet<String>();
		v1.add(null);
		v1.add(null);
		v1.add("Hello");
		v1.add("Hello");
		v1.add("limit");
		v1.add("Allvalues");
		System.out.println("v1 values"+v1);
		Iterator<String> aa= v1.iterator();
		while(aa.hasNext()) {
			System.out.println(aa.next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree_set_tryconcept obj= new Tree_set_tryconcept();
		obj.range();

	}

}
