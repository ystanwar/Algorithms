import java.util.*;
public class LinearProbingHashTable{
	public static <T> void main(String args[])
	{
		Integer[] main = {1,2,3,4,4,5,6,0};
		Set<Integer>  mySet = new HashSet<Integer>(Arrays.asList(main));
		
		int[] sub = {1,2,4,11};
		int flag=0;
		for(int i=0;i<sub.length;i++)
		{
			if(!mySet.contains(sub[i]))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Its a Subset");
		}
		else
		{
			System.out.println("Its not a Subset");
		}
				
		
		
		
	}
}
