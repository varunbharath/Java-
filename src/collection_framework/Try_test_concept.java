package collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Try_test_concept {
static	void  test() {
		Set<String> Storedvalue= new HashSet<String>();
		//Set<String> value= new HashSet<String>();
		Storedvalue.add("Hello");
		Storedvalue.add(null);
		Storedvalue.add("Rank");
		Storedvalue.add("Enter the value");
		Storedvalue.add("rearange the words");
		Storedvalue.add(null);
		Storedvalue.add("Hello");
		System.out.println(" Storedvalue"+ "  "+ Storedvalue);
		Iterator<String> reenterthevalue= Storedvalue.iterator();
		while(reenterthevalue.hasNext()) {
			System.out.println("reenterthevalue"+ reenterthevalue.next());
			
			
		}
		
	}
	void renewelpolicy() {
		Scanner renew=new Scanner(System.in);
		System.out.println("renew value"+renew);
		this.test();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet_Program obj=new TreeSet_Program();
		test();
		

	}

}
