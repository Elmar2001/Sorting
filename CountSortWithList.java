package as08;

import java.util.ArrayList;
import java.util.Arrays;

public class CountSortWithList {

	static void sort(int a[], int n) {

		int max = a[0];

		for (int i = 1; i < n; i++)
			if (a[i] > max)
				max = a[i];

		ArrayList[] L = new ArrayList[max + 1];

		for (int i = 0; i < n; i++)
			L[a[i]] = new ArrayList();

		for (int i = 0; i < n; i++)
			L[a[i]].add(a[i]);

		ArrayList output = new ArrayList();

		for (int i = 0; i < L.length; i++)
			for (int j = 0; L[i] != null && j < (L[i]).size(); j++)
				output.add((L[i]).get(j));

		for (int i = 0; i < n; i++)
			a[n - i - 1] = (int) output.get(i); // nice trick

	}

	public static void main(String[] args) {
		int[] a = { 4, 5, 9, 1, 0, 12, 13, 6, 3, 9, 11, 1, 5, 3, 7 };
		sort(a, a.length);
		System.out.println(Arrays.toString(a));

	}

}
