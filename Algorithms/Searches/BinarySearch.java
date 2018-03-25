// complexity o(log N) .. space o(1)

public static Boolean binarySearch(int[] arr, int n){
    int low = 0;
    int high = arr.length - 1;
   
    while (low <= high){
        
        int mid = low + (high - low)/2;
        
        if (arr[mid] < n){
            low = mid + 1;
        } else if (arr[mid] > n){
            high = mid - 1;   
        }
        else {
            return true;
        }
    }
    return false;
}