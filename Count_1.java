
public class Count_1 {

	static int count(int[] a , int low, int high)
	{
		int mid = (low+high)/2;
		if(a[mid]==1 && a[mid+1]==0)
		{
			return mid+1;
		}
		else if(a[mid+1]==1)
		{
			return count(a,mid+1,high);
		}
		else
		{
			return count(a,low,mid-1);
		}
		
	}
	public static void main(String args[])
	{
		int[] a = {1, 1, 0, 0, 0, 0, 0};
		int n = a.length;
		System.out.println(count(a,0,n-1));
	}
}
