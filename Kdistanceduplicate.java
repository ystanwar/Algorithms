//Check if a given array contains duplicate elements within k distance from each other


import java.util.*;
public class Kdistance {

	static void KD(Integer[] a, int n,int k)
	{
		int flag=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[j]==a[i] && j-i <= k)
				{
					System.out.println("true");
					 flag=1;
					break;
				}
			}
			if(flag==1)
				break;
		}
	}
	public static void main(String args[])
	{
		Integer[] a = {1, 2, 3, 1,5, 2, 3, 4};
		int k =3;
		KD(a,a.length,k);
	}
}
