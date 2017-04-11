
public class KMP {
	
	static void computeLPSArray(String pat,int m , int[] lps)
	{
		int len =0; //length of the previous longest prefix suffix;
		int i=1;
		lps[0]=0; //lps[0] is 0 always
		while(i<m)
		{
			if(pat.charAt(i)==pat.charAt(len))
			{
				len++;
				lps[i]=len;
				i++;
				
			}
			else
			{
				if(len!=0)
				{
					len = lps[len-1];
				}
				else
				{
					lps[i]=len;
					i++;
				}
			}
		}
	}
	
	static void Search(String txt,String pat)
	{
		int m = pat.length();
		int n = txt.length();
		
		//int i,j;
		int p=0;//hash value for pattern
		int q=0;//hash value for text
		int h=1;
		int[] lps = new int[m];
		computeLPSArray(pat,m,lps);
		int i=0;//index for txt
		int j=0; //index for pat
		while(i<n)
		{
			if(pat.charAt(j) == txt.charAt(i))
			{
				j++;
				i++;
			}
			if(j==m)
			{
				System.out.println("Found Pattern at index "+(i-j));
			}
			else if(i<n && pat.charAt(j)!=txt.charAt(i))
			{
				//Do not match lps[0...lps[j-1]] character ,
				//they will match anyway
				if(j!=0)
				{
					j = lps[j-1];
				}
				else
				{
					i=i+1;
				}
			}
		}
		
		
	}

	public static void main(String args[])
	{
		String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        
        Search(txt,pat);
	}
}
