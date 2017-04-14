
public class min_length_unsorted_array {

	static void unsorted(int[] a , int n)
	{
		int s=0;
		int e=0;
		for(int i=0;i<=n;i++)
		{
			if(a[i]>a[i+1])
			{
				s=i;
				break;
			}
		}
		for(int i=n;i>=0;i--)
		{
			if(a[i]<a[i-1])
			{
				e=i;
				break;
			}
		}
		int min = Integer.MAX_VALUE;
		for(int i=s;i<=e;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		int max = Integer.MIN_VALUE;
		for(int i=s;i<=e;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		for(int i=0;i<s;i++)
		{
			if(a[i]>min)
			{
				s=i;
				break;
				
			}
		}
		for(int i=e+1;i<=n;i++)
		{
			if(a[i]<max)
			{
				e=i;
				break;
			}
		}
		System.out.println("The array should be sorted from"+s+" "+e);
	}
	public static void main(String args[])
	{
		int a[]=	{0, 1, 15, 25, 6, 7, 30, 40, 50};
		int n = a.length;
		unsorted(a,n-1);
	}
}
