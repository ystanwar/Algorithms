//length of the subarray with sum zero.


import java.util.*;

public class LargestSubarraywithSumzero {

	static void LSS(Integer[] a, int n) {

		int sum = 0;
		Integer[] c = new Integer[n];
		int max = -1;
		Arrays.fill(c, 0);

		for (int i = 0; i < n; i++) {
			sum = sum + a[i];

			if (Arrays.asList(c).contains(sum)) {

				int j = Arrays.asList(c).indexOf(sum);
				int t = i - j;
				if (t > max) {
					max = t;
				}
			}
			c[i] = sum;

		}
		System.out.println(max);

	}

	public static void main(String args[]) {
		Integer[] a = { 15, -2, 2, -8, 1, 7, 10, 23 };
		int n = a.length;
		LSS(a, n);
	}
}
