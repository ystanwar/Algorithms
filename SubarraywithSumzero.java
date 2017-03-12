//check if there exists a subarray with sum zero


import java.util.*;

public class LargestSubarraywithSumzero {

	static void LSS(Integer[] a, int n) {
		HashSet<Integer> mySet = new HashSet<Integer>();
		int sum = 0;
		int max = -1;
		Iterator itr = mySet.iterator();
		int flag = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + a[i];
			if (mySet.contains(sum)) {
				flag = 1;
				System.out.println("Yes the subarray exist with sum zero");
				break;
			}

			mySet.add(sum);

		}
		if (flag == 0) {
			System.out.println("No such array exist");
		}

	}

	public static void main(String args[]) {
		Integer[] a = { 15, -2, 2, -8, 1, 7, 10, 23 };
		int n = a.length;
		LSS(a, n);
	}
}
