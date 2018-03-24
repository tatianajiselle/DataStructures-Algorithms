// o(n)

public int myLinearSearch(int arr[], int data){

	for(int i=0; i <= arr.length - 1; i++){
		if (arr[i] = data){
			return i;
		}
	}

	return null; // if the data isnt in the array
}