
public class CommonElementsinSortedArray {
	
	static void match(int[] a1, int[] a2, int[] a3)
	{
		int x=0;
		int y=0;
		int z=0;
		int n1 = a1.length;
		int n2 = a2.length;
		int n3 = a3.length;
		while(true)
		{
			if(a1[x]==a2[y] && a2[y]==a3[z])
			{
				System.out.print(a1[x]+" ");
				x++;y++;z++;
			}
			if(a1[x]>a2[y] || a3[z]>a2[y])
			y++;
			else if(a1[x]<a2[y] || a3[z]>a1[x])
				x++;
			else
				z++;
			if(x==(n1-1) || y==(n2-1) || z == (n3-1))
				break;
			//System.out.println(x+" "+y+" "+z);
		}
	}

	public static void main(String args[])
	{
		int a1[] = {2,3,5,7,11,13};
		int a2[] = {3,5,7,12,14};
		int a3[] = {1,3,4,6,7,11,12,14,16};
		match(a1,a2,a3);
	}
}
