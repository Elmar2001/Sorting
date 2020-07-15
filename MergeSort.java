package sort;

public class MergeSort {
	
	public static void mergeSort(int[] arr, int p, int r)
	{
		if(p < r)
		{
			int q = (p+r)/2;
			mergeSort(arr, p, q);
			mergeSort(arr, q+1, r);
			merge(arr, p, q, r);
			
		}
	}

	private static void merge(int[] arr, int p, int q, int r)
	{
		int n1 = q - p + 1;
		int n2 = r - q;
		int i, j;
		
		int[]left = new int[n1+1];
		int[]right = new int[n2+1];
		
		for(i = 0; i < n1; i++)
			left[i] = arr[p + i];
		
		for(i = 0; i < n2; i++)
			right[i] = arr[q + i + 1];
		
		left[n1]  = Integer.MIN_VALUE;
		right[n2] = Integer.MIN_VALUE;
		
		i = j = 0;
		
		for(int k = p; k <= r;k++)
		{
			if(left[i] >= right[j])
				arr[k] = left[i++];
			else
				arr[k] = right[j++];
		}
	}
}