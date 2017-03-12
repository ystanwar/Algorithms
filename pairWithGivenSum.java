//Given an array A[] and a number x, check for pair in A[] with sum as x

import java.util.Arrays;
public class pairWithgivensum {
	public static void main(String args[])
	{
		int[] a = {1,2,4,3,9,6};
		int n = a.length;
		int l =0;
		int r = n-1;
		int x =19;
		int sum=0;
		Arrays.sort(a);
		
		int flag=0;
		while(l<r)
		{
			sum = a[l]+a[r];
			if(sum == x)
			{
				System.out.println("yes "+a[l]+" "+ a[r]);
				flag=1;
				break;
			}
			else if(sum <x)
			{
				l++;
			}
			else
			{
				r--;
			}
		}
		if(flag==0)
			System.out.println("No");
	}
	
	
}
