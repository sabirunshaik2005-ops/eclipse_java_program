package cse;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
	public static void main(String[] args) {
ArrayList<String> names=new ArrayList<>();
Scanner s=new Scanner(System.in);
System.out.println("enter 5 names");
for(int i=0;i<5;i++) {
	System.out.println("Names"+(i+1)+":");
String name=s.nextLine();
names.add(name);
	}
for(String name:names)
	System.out.println(name); 
s.close();

	}
}
