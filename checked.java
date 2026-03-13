package cse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class checked {
public static void main(String[] args) {
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter ur name");
	try
	{
		String name=reader.readLine();
		System.out.println("Hello"+name+"!");
	}
	catch(IOException e)
	{
		System.out.println("an error occured while reading input"+e.getMessage());
	}
}
}
