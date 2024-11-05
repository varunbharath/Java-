package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_program {
static	void range() {
	 HashMap<String, String> name= new HashMap<String, String>();
	// HashMap<Key, Value> name= new HashMap<Key, value>();
	 //key -->Allowed one null value,  unique key like  example for (Set  characters reflect here)
	 // value -- allowed n numbers of duplicate value, n numbers of null value( list character wise will work)
	 
	 
	// name.put(key, value)
	 name.put(null, null);
	 name.put("HI","Welcome");
	 name.put("HI","Welcome");
	 name.put(null, null);
	 name.put(null, null);
	 name.put(null, null);
	 name.put(null, null);
	 name.put("null",null);
	 name.put("HI",null);
	 name.put("HI","Welcome");
	 name.put("HI",null);
	 name.put("HI","Welcome");
	 System.out.println(name);
	 for(Map.Entry<String, String >single:name.entrySet() )
	 {
		 System.out.println(single.getKey());
		 System.out.println(single.getValue());
		 
	 }  
	 
	 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashmap_program obj=new Hashmap_program();
		range();

	}

}
