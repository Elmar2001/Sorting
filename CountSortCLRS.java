package as08;

import java.util.Arrays;

public class CountSortCLRS {

	static void countingSort(int arr[], int k) {

		int n = arr.length;

		int result[] = new int[n];

		int count[] = new int[k];

		for (int i = 0; i < n; i++)
			count[arr[i]]++;

		for (int i = k - 2; i > 0; i--)
			count[i] += count[i + 1];

		for (int i = n - 1; i >= 0; i--) {
			result[count[arr[i]] - 1] = arr[i];
			count[arr[i]]--;
		}

		for (int i = 0; i < n; i++)
			arr[i] = result[i];
	}

	public static void main(String[] args) {
		int[] a = { 4, 5, 9, 1, 12, 13, 6, 3, 9, 11, 1, 5, 3, 7 };
		
		int max = a[0];		
		
		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];
		
		countingSort(a, max + 1);

		System.out.println(Arrays.toString(a));

	}

}
