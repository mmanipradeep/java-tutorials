public class ArrayRotate {

    public static void main(String[] args) {
        ArrayRotate rotate = new ArrayRotate();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotate(arr, 1, 7);
        rotate.printArray(arr, 7);

    }


    /*Function to left rotate arr[] of size n by d*/
    void leftRotate(int arr[], int d, int n) {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }


    void leftRotatebyOne(int arr[], int n) {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n - 1] = temp;
    }

    /**
     * Steps
     * 1. Introduce 2 int variables
     * 2.  Put the first element in a variable
     *3.  iterate from 0 to no.of eleemnets -1
     *
     * @param arr
     * @param n
     */
    /* utility function to print an array */
    void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // Driver program to test above functions

}
