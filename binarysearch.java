package cse;

import java.util.Scanner;

public class binarysearch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	int n=sc.nextInt();
	int [] arr=new int[n];
	System.out.println("enter elements in sorted order");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
}
	System.out.println("enter element to search:"); 
	 int key=sc.nextInt();
	 int low=0,high=n-1;
	 boolean found=false;
	while(low<=high)
	{
		int mid=(low+high)/2;
		if(key==arr[mid])
		{
			System.out.println("element found:"+(mid+1));
			found=true;
			return;
		}
		else if(arr[mid]<key)
		{
			low=mid+1;

		}
		else 
		{
			high=mid-1;
		}
	}
	if(!found)
	{
		System.out.println("element not found");
	}
	sc.close();

}
}
