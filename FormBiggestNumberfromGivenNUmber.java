import java.util.Arrays;
import java.util.*;
public class FormBiggestNumberfromAgivenNumber {

	public static int Max(int n) {
		int l = n;
		int i = 0;
		int count = -1;
		int[] digits = new int[4];
		
		while (l > 0) {
			int t = l % 10;
			l = (l - t) / 10;
			
			digits[i] = t;
			i++;
			count++;
		}
		
		
		Arrays.sort(digits);
		System.out.println();
		
		
		i = 0;
		int max=0;
		for (i = count; i >= 0; i--) {
			max =(int)(max + digits[i]*Math.pow(10,i )) ;
		}
		
		return max;

	}

	public static void main(String args[]) {
		int n = 1294;
		System.out.println(Max(n));
	}
}
