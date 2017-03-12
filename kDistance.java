import java.util.*;
public class kDistanc {

	static boolean KD(int[] a, int k)
	{
		int n = a.length;
		Set<Integer> mySet = new HashSet<Integer>();
		for(int i =0;i< n;i++)
		{
			if(mySet.contains(a[i]))
			{
				return true;
			}
			mySet.add(a[i]);
			if(i>=k)
			{
				mySet.remove(i-k);
			}
		}
		return false;
	}
	
	public static void main(String args[])
	{
		int[] a ={1,2,3,4};
		int k =3;
		if(KD(a,k))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
