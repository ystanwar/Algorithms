
public class StringSearching {

	static void match(char[] s1 , char[] s2,int n1, int n2)
	{
		int p=0;
		int q=0;
		for(int i=0;i<n1;i++)
		{
			if(s1[i]==s2[p])
			{
				p++;
			}
			else {
				p=0;
			}
			if(p==n2)
			{
				p=0;
				System.out.println("pattern found at index"+(i-n2+1));
			}
		}
	}
	
	public static void main(String args[])
	{
		String s1 = "AABAACAADAABAABA";
		String s2 = "AABA";
		
		match(s1.toCharArray(),s2.toCharArray(),s1.length()-1,s2.length()-1);
	}
}
