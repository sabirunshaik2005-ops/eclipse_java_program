package cse;

import java.util.Arrays;

public class binarysort {
public static void main(String[] args) {
	int key=55;
	int [] bin= {13,12,55,66,45};
	Arrays.sort(bin);
	System.out.println("before binary search:"+Arrays.toString(bin));
	System.out.println("after binary search:"+Arrays.binarySearch(bin,key));
}
}
