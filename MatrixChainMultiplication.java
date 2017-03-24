
public class MatrixChainMultiplication {

	public static int cost(int[] a)
	{
		int n = a.length;
		int [][] m = new int[n][n];
		for(int i=0;i<n;i++)
		{
			m[i][i]=0;
		}
		//l is chain length;
		int j , i,k;
		int max=10000;
		int q=0;
		for(int l =2 ;l<n;l++)
		{
			for( i=1;i<n-l+1;i++)
			{
				j=i-l+1;
				m[i][j] = max;
				for(k=i;k<=j-1;k++)
				{
					q=m[i][k]+m[k+1][j]+a[i-1]*a[k]*a[j];
				}
				if(q<m[i][j])
				{
					m[i][j]=q;
				}
			}
		}
	
	return m[1][n-1];
	
	}
	public static void main(String args[])
	{
		int[] a= {4,2,3,5,3};
		System.out.println("Minimum Cost to Multiply Matrix is"+cost(a));
		
	}
	
}
