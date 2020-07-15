package as06;

import java.util.Random;

/**
 * 
 * @author elm4r When the arr is already sorted, best to use randomized. General
 *         qsort otherwise.
 *
 */
public class QuickSortAnalysis {

	public static void main(String[] args) {
		Random r = new Random();
		long time1, time2;

		int[] arr1 = new int[100];

		for (int i = 0; i < arr1.length; i++)
			arr1[i] = i;

		int[] arr2 = arr1.clone();

		time1 = System.nanoTime();
		QuickSort.quicksort(arr1, 0, arr1.length - 1);
		time2 = System.nanoTime();

		System.out.println(time2 - time1);

		time1 = System.nanoTime();
		QuickSortRandomized.quicksort(arr2);
		time2 = System.nanoTime();

		System.out.println(time2 - time1);

		// =====================================

		arr1 = new int[10000];
		for (int i = 0; i < arr1.length; i++)
			arr1[i] = r.nextInt() % 100;

		arr2 = arr1.clone();

		time1 = System.nanoTime();
		QuickSort.quicksort(arr1, 0, arr1.length - 1);
		time2 = System.nanoTime();

		System.out.println(time2 - time1);

		time1 = System.nanoTime();
		QuickSortRandomized.quicksort(arr2);
		time2 = System.nanoTime();

		System.out.println(time2 - time1);

	}

}
