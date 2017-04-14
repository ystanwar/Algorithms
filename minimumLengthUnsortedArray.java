
public class Minimum_length_unsorted_Array {
	
	static void unsorted(int[] a , int n)
	{
		int f=0;
		int l=0;
		int flag1=0;
		int flag2=0;
		for(int i=0;i<=n;i++ )
		{
			for(int j=i+1;j<=n;j++)
			{
				
				if(a[i]> a[j])
				{
					System.out.println(i+" "+j);
					f=i;
					flag1=1;
					break;
				}
				
			}
			if(flag1==1)
				break;
		}
		for(int i = n;i>=0;i--)
		{
			for(int j = i-1;j>=0;j--)
			{
				if(a[i]<a[j])
				{
					l=i;
					flag2=1;
					break;
				}
			}
			if(flag2==1)
				break;
		}
		
		System.out.println("The array should be sorted from "+f+"to"+l);
	}

	public static void main(String args[])
	{
	int a[]=	{0, 1, 15, 25, 6, 7, 30, 40, 50};
	int n = a.length;
	unsorted(a,n-1);
	}
}
