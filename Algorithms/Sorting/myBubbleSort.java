public static void myBubbleSort(int arr[]){
	// from beginning of array to array.length -1 compare i with i+1
	// if i+1 is bigger, swap, else, check with i +2 .... etc till length ends
	// once that number has compared vs every index, move to next index
	// continue until the end of the array

	// sorting in place
	// o (n^2) worst case
	for(int i = 0; i < arr.length - 1; i++){
		for (int j = 0; j < arr.length - i - 1; j++){ // we subtract j here because once we have accessed that value, we no longer need to revisit that spot in the array
			if(arr[j] > arr[j+1]){ // if the number is larger than the next index's value
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = arr[j];
			}
		}
	}
}