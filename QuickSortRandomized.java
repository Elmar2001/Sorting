package as06;

import java.util.Arrays;
import java.util.Random;

public class QuickSortRandomized {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 3, 6, 7, 4, 0, 9, 5, 4, 3, 2, 1, -5, 0, 1234 };

		System.out.println(Arrays.toString(arr));

		quicksort(arr);

		System.out.println(Arrays.toString(arr));

	}

	public static void quicksort(int[] A, int p, int r, Random rand) {
		if (p < r) {
			int q = partition(A, p, r, rand);
			quicksort(A, p, q - 1, rand);
			quicksort(A, q + 1, r, rand);
		}
	}

	public static void quicksort(int[] A) {
		Random rand = new Random();
		if (A.length > 1) {
			quicksort(A, 0, A.length - 1, rand);
		}
	}

	public static int partition(int[] A, int p, int r, Random rand) {
		int idk = rand.nextInt(r - p + 1) + p;
		swap(A, r, idk);

		int x = A[r];
		int i = p - 1;

		for (int j = p; j < r; j++) {
			if (A[j] <= x) {
				i++;
				swap(A, i, j);
			}
		}

		swap(A, r, i + 1);
		return i + 1;
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}