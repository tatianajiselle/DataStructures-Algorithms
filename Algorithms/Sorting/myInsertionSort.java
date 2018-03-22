// o (n * n) = o(n^2)
// sorts in place

// check array first index with next. compare. if smaller. move to proper place. else, move to next index
public static void myInsertionSort(int arr[]){
	
	for (int i = 1; i <= arr.length - 1; i++) {  
		int value = arr[i];  
		int j = i-1;  
		while ( (j >= 0) && ( arr[j] > value ) ) {  
			arr[j + 1] = arr[j];  
			j--;  
		}  
		arr[j + 1] = value;  
	}
}