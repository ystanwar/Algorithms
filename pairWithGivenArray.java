import java.util.*;
public class pairwithGivenArray {
	public static void main(String args[])
	{
		Integer[] arr = {1,2,4,3,9,6};
		int n = arr.length;
		int l =0;
		int r = n-1;
		int x =9;
		int sum=0;
		Set<Integer> myset = new HashSet<Integer>(Arrays.asList(arr)); 
		Integer[] a = myset.toArray(new Integer[myset.size()]);
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
