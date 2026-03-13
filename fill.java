package cse;

import java.util.Arrays;

public class fill {
public static void main(String[] args) {
	int [] num=new int[5];
	Arrays.fill(num,-1);
	System.out.println("default values are:"+Arrays.toString(num));
	
	/*int [] a= {1,2,3,7,6,8,9};
	Arrays.fill(a,1,4,88);
	System.out.println("values are:"+Arrays.toString(a));
*/
}
}
