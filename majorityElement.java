//if a set contains any element which occurs atleast 2n/3 times , it is called majority element
public class MultiSet {

	
	static void maj_element(int[] a , int n)
	{
		int i;
		int max =-1;
		for(i=0;i<n;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		
		int t[] = new int[max+1];
		for(i=0;i<n;i++)
			t[a[i]]++;
		
		
		int p = 2*n/3;
		
		for(i=0;i<=max;i++)
		{
			if(t[i]>=p)
				break;
		}
		System.out.println(i);
		
	}
	
	
	
	
	public static void main(String args[])
	{
		int a[] = {1,2,3,6,7,3,2,3,4,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		int n = a.length;
		maj_element(a,n);
	}
}
