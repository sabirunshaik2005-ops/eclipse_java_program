package cse;

import java.util.Arrays;

public class bubblesort {
public static void main(String[] args) {
	int [] arr= {4,8,6,9,2};
	System.out.println("oirginal array:"+Arrays.toString(arr));
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=0;j<arr.length-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	System.out.println("sorted elements:"+Arrays.toString(arr));
}
}
