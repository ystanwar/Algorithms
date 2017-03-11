
public class CountingInversion {
	static int merge(int[] a, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int inversion = 0;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = 0; i < n1; i++) {
			L[i] = a[p + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = a[q+1+i];
		}

		int i = 0, j = 0, k = p;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				a[k] = L[i];
				i++;
			} else {
				a[k] = R[j];
				j++;
				inversion = inversion + n1 - i;
			}
			k++;
		}
		while (i < n1) {
			a[k] = L[i];
			k++;
			i++;
		}
		while (j < n2) {
			a[k] = R[j];
			k++;
			j++;
		}
		return inversion;
	}

	static int CI(int[] a, int p, int r) {
		int inversion = 0;
		if (p < r) {
			int q = (p + r) / 2;
			inversion += CI(a, p, q);
			inversion += CI(a, q + 1, r);
			inversion += merge(a, p, q, r);
		}
		return inversion;
	}

	

	public static void main(String agrs[]) {
		int a[] = { 2, 4, 1, 3, 5 };
		int inversion = CI(a, 0, 4);
	
		System.out.println("\n"+inversion);
		
	}
}
