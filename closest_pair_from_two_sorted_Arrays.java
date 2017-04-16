
public class closest_pair_from_two_sorted_Arrays {
	static void find(int a1[],int a2[],int x)
	{
		int n1 = a1.length;
		int n2= a2.length;
		int i=0;int j=n2-1;
		int min = Integer.MAX_VALUE;
		
		int sum=0;
		int res_r=0;
		int res_l=0;
		while(i<n1 && j>=0)
		{
			
			sum = a1[i]+ a2[j];
			
			if(Math.abs(sum-x)<min)
			{
				res_l=i;
				res_r=j;
				min = sum;
				
			}
			if(sum - x <=0)
			{
				i++;
				//System.out.println("hello");
			}
			else
			{
				j--;
			}
		//	System.out.println(i+"   "+j);
		}
		
		System.out.println(a1[res_l]+"and"+a2[res_r]);
		
	}
	public static void main(String args[])
	{
		int  a1[] = {1, 4, 5, 7};
	     int a2[] = {10, 20, 30, 40};
	     int x=50;
	     find(a1,a2,x);
	}
}
