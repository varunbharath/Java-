 package collection_framework;

import java.util.*;

public class ListProgram {
	void Listexample() {
		//List<string> name=new ArrayList<E>();
		
		List<String> name=new ArrayList<String>();
		name.add("Hello");
		name.add("HI");
		name.add(null);
		name.add(null);
		name.add(null);
		name.add(null);
		name.add("HI");
		name.add(null);
		name.add(null);
		name.add(null);
		name.add(null);
		name.add("HI");
		name.add(null);
		name.add(null);
		name.remove("HI");
		System.out.println(name);
		
		ListIterator<String> allnames=name.listIterator();
		while(allnames.hasNext()) {
			System.out.println(allnames.next());
		}
		while(allnames.hasPrevious()) {
			System.out.println(allnames.previous());
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListProgram obj=new ListProgram();
		obj.Listexample();

	}

}
