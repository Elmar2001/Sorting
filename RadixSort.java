package as08;

import java.util.Arrays;

public class RadixSort {

	static void countingSort(int array[], int size, int place) {
		int[] result = new int[size + 1];

		int max = getMax(array, size);

		int[] count = new int[max + 1];

//		for (int i = 0; i < max; ++i)
//			count[i] = 0;

		for (int i = 0; i < size; i++)
			count[(array[i] / place) % 10]++;

		for (int i = size - 1; i >= 0; i--)
			count[i] += count[i + 1];

		for (int i = size - 1; i >= 0; i--) {
			result[count[(array[i] / place) % 10] - 1] = array[i];
			count[(array[i] / place) % 10]--;
		}

		for (int i = 0; i < size; i++)
			array[i] = result[i];

	}

	static int getMax(int array[], int n) {
		int max = array[0];

		for (int i = 1; i < n; i++)
			if (array[i] > max)
				max = array[i];

		return max;
	}

	static void radixSort(int array[], int size) {
		int max = getMax(array, size);

		for (int place = 1; max / place > 0; place *= 10)
			countingSort(array, size, place);
	}

	public static void main(String args[]) {
		int[] data = { 1, 2, 6, 321, 8, 153, 913, 15, 10, 123, 3, 103 };

		radixSort(data, data.length);

		System.out.println(Arrays.toString(data));
	}

}
