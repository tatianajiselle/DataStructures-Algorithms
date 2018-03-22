// o (n^2)
// take lowest element in array and move it to the front w/ swap
// increase index and repeat

public static void mySelectionSort(int arr[]){

	for(int i=0; i<= arr.length - 1; i++){
		int index = i;
		for(int j = 0; j <= arr.length - 1; j++){ // search the list for the index of the smallest number
			if(arr[j] < arr[index]){
				index = j;
			}
		}

		// swap the smaller number with the index being compared
		int temp = arr[index];
		arr[index] = arr[i];
		arr[i] = temp;
	}
}