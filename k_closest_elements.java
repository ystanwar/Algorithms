import java.util.*;
public class K_closest_elements {

	
	static int  find(int[] a , int low,int high, int x)
	{
		if(x>=a[high])
		{
			return high;
		}
		else if(x<=a[low])
		{
			return low;
		}
		else
		{
			int mid = (low+high)/2;
			if(a[mid]==x)
			{
				return mid;
			}
			else if(x>a[mid])
			{
				return find(a,mid+1,high,x);
			}
			else
			{
				return find(a,low,mid-1,x);
			}
		}
			
		
	}
	static void Print_k_closest(int[] a , int x, int k, int n)
	{
		
		int l = find(a,0,n,x);
		System.out.println(l);
		int r=l+1;
		int count=0;
		if(a[l]==x) l--;
		while(r<=n && l>=0 && count <k)
		{
			if(x-a[l]<a[r]-x)
			{
				
				System.out.println(a[l]);
				l--;
			}
			else
			{
				System.out.println(a[r]);
				r++;
			}
			count++;
		}
		
		while(l>=0 && count<k)
		{
			System.out.println(a[l]);
			l--;
			count++;
		}
		while(r<=n && count <k)
		{
			System.out.println(a[r]);
			r++;
			count++;
		}
		
	}
		
	
	public static void main(String args[])
	{
		int[] a = {12, 16, 22, 30, 35, 39, 42, 
	               45, 48, 50, 53, 55, 56};
		int k =4;
		int x=35;
		int n = a.length;
		Print_k_closest(a,x,k,n-1);
		
	}
}
