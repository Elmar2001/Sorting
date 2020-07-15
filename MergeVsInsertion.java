package sort;

import java.util.Arrays;
import java.util.Random;


/**
 * 
 * For small size (up to 30) arrays it's more efficient to use insertion sort and merge sort for bigger ones.
 *
 */
public class MergeVsInsertion {

	public static void main(String[] args) {
		long millis, millis2;
		
		int[] arr = {3,4,5,6,7,3,2,0,8,6,4,6,1};
		
		int[] arr2 = arr.clone();
		
		System.out.println(Arrays.toString(arr));
		
		/*Grab time in millis*/
		millis = System.currentTimeMillis();
		InsertionSort.insertionSort(arr);
		millis2 = System.currentTimeMillis();
		
		/*Subtract milliseconds*/
		System.out.println(millis2 - millis);

		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		
		System.out.println(Arrays.toString(arr2));
		
		/*Grab time in millis*/
		millis2 = System.currentTimeMillis();
		MergeSort.mergeSort(arr2, 0, arr2.length - 1);
		millis2 = System.currentTimeMillis();
		
		/*Subtract milliseconds*/
		System.out.println(millis2 - millis);

		System.out.println(Arrays.toString(arr2));
		
		System.out.println();
		
		int[] rand = new int[1000];
		
		Random r = new Random();
		
		for(int i = 0; i < 1000; i++)
			rand[i] = r.nextInt();
		
		int[] rand2 = rand.clone();
		
		System.out.println(Arrays.toString(rand));
		
		/*Grab time in millis*/
		millis = System.currentTimeMillis();
		InsertionSort.insertionSort(rand);
		millis2 = System.currentTimeMillis();

		/*Subtract milliseconds*/
		System.out.println(millis2 - millis);
		
		System.out.println(Arrays.toString(rand));
		
		System.out.println();
		
		System.out.println(Arrays.toString(rand2));
		
		/*Grab time in millis*/
		millis = System.currentTimeMillis();
		MergeSort.mergeSort(rand2, 0, rand2.length - 1);
		millis2 = System.currentTimeMillis();
		
		/*Subtract milliseconds*/
		System.out.println(millis2 - millis);
		
		System.out.println(Arrays.toString(rand2));
		
	}

}
