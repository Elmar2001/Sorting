package sort;

public class InsertionSort {
	
    public static void insertionSort(int array[]) {
	    int key;
	    int j;
	    
	    for(int i = 1; i < array.length; i++) {
	    	key = array[i];
	    	j = i - 1;
	
	        while(j >= 0 && array[j] < key)
	        	array[j + 1] = array[j--];
	                    
	        array[j + 1] = key;
	    }
    }
}
