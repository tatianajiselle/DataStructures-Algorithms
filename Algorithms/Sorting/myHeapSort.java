public class myHeapSort{

    private static int N; // root

    // swaps first and last items in array
    public void swap (int arr[], int i, int index){
        int temp = array[i];
        array[i] = array[index];
        array[index] = temp;
    }

    /* the goal of this function is to move the max value to the root 
    + make all of the parents larger than its children. we can decrease
    the sort time from n (log n) to (log n) with this step */
    public void buildMaxHeap(int arr[]){ // o(n)
        int height = Math.floor(arr.length - 1 /2);

        // here we make n-1 calls to heapify
        while (height >= 0){
            heapify(arr,height,(arr.length-1));
            height--;
        }
    }

    // Compare two nodes in a relationship, making the larger item the parent
    public void heapify(int arr[], int index, int arrLength){ // o(log n)
        while (i < arrLength){
            int i = index;

            // check left child
            if ((2*i +1) < arrLength && arr[2*i+1] > arr[index]){
                index = 2*i+1;
            }

            // check right child
            if ((2*i +2) < arrLength && arr[2*i+2] > arr[index]){
                index = 2*i+2;
            }

            if (i == index){
                break;
            }

            swap(arr,i,index);
        }
    }

    // to save space, we make the sort in place
    public void heapSort(int arr[]){
        buildMaxHeap(arr);

        // fetch last index
        int lastElement = arr.length -1; 

        // sort until the last element
        while (lastElement > 0){
            swap(arr, 0, lastElement);
            heapify(arr, 0, lastElement);
            lastElement--;
        }
    }
}