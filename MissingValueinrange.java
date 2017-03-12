//Given an array arr[0..n-1] of distinct elements and a range [low, high], find all numbers that are in range, but not in array. The missing elements should be printed in sorted order.

import java.util.*;

public class MissingValueinRange {

	static void MV(Integer[] a, int low, int high) {
		Set<Integer> mySet = new HashSet<Integer>(Arrays.asList(a));
		int c[] = new int[high - low + 1];
		for (int i = 0; i < high - low + 1; i++) {
			c[i] = low + i;
		}
		for (int i = 0; i < high - low + 1; i++) {
			if (!mySet.contains(c[i])) {
				System.out.println(c[i]);
			}

		}
	}

	public static void main(String args[]) {
		Integer[] a = { 1, 3, 5, 4 };
		int low = 1;
		int high = 10;
		MV(a, low, high);
	}
}

