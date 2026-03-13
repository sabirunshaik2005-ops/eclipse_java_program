package cse;

import java.util.Arrays;

public class equals {
	public static void main(String[] args) {
		String [] s1={"aits","rajampet"};
		String [] s2= {"aits","rajampet"};
		if(Arrays.equals(s1,s2))
		{
			System.out.println("Equals");
		}
		else
		{
			System.out.println("Not equals");
		}
	}
}
