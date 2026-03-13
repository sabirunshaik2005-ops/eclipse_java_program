package cse;

import java.util.Arrays;

public class reversearray {
	public static void main(String[] args) {
		int [] a={1,2,3,4,5};
		
		int N[]=Arrays.copyOf(a,a.length);
				System.out.println(" before reverse of array:"+Arrays.toString(N));

		for(int i=0;i<a.length;i++)
		N[i]=a[a.length-1-i];
				System.out.println("reverse of array:"+Arrays.toString(N));
	}
	}
