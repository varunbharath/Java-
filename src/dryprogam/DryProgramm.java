package dryprogam;

import java.util.Scanner;

public class DryProgramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String name1= "Bharath";
	String name2="Kumar";
	String c=name1+name2;
	System.out.println("Before wapping"+name1+name2);
	
	name2=c.substring(0,c.length()-name2.length());
	name1=c.substring(name2.length());
	System.out.println("Afterswapping"+name1+name2);
	
	
	}

}
