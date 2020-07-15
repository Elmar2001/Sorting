package as08;

import java.util.Arrays;

public class CountSortSigned {

	public static void countingSort(int[] a, int n) {
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			if (a[i] > max)
				max = a[i];
			if (a[i] < min)
				min = a[i];
		}

		int[] count = new int[max - min + 1];

		for (int i = 0; i < n; i++)
			count[a[i] - min]++;

		for (int i = 0, c = 0; i < count.length; i++) {
			Arrays.fill(a, c, c + count[i], i + min);
			c += count[i];
		}
	}

	public static void main(String[] args) {
		int[] a = { -3, 4, 5, -9, -1, 9, 1, -5, 0, 12, 13, 6, 3, 9, -6, 11, 1, 5, 3, 7, -1 };

		countingSort(a, a.length);

		System.out.println(Arrays.toString(a));
	}

}
