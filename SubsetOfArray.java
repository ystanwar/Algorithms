
public class SubArrayofArray {

	static void check(int[] a, int[] b) {
		int n = a.length;
		int m = b.length;
		int flag = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[j] == b[i]) {
					flag = 1;
					break;

				}
				else
				{
					flag=0;
				}
			}
		}
		if (flag == 1) {
			System.out.println("yes");
		} else {
			System.out.println("no");

		}
	}

	public static void main(String args[]) {
		int[] a = { 1, 3, 2, 5, 4, 8, 7 };
		int[] b = { 5, 4, 8,9};
		check(a, b);
	}
}
