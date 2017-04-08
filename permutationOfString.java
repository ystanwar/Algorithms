
public class PermutationOfString {

	
	static void swap(char[] s ,int l , int i )
	{
		char temp = s[l];
		s[l] = s[i];
		s[i]=temp;
	}
	static void permute(char[] s , int l , int r)
	{
		if(l==r)
		{
			System.out.println(s);
		}
		for(int i=l;i<=r;i++)
		{
			swap(s,l,i);
			permute(s,l+1,r);
			swap(s,l,i);
		}
	}
	
	public static void main(String args[])
	{
		String s = "abc";
		int n = s.length()-1;
		permute(s.toCharArray(),0,n);
	}
}
