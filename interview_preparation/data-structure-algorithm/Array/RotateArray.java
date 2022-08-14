class RotateArray{
	
		public static void main(String[] args){
		RotateArray rotate = new RotateArray();
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		rotate.leftRotate(arr, 2, 7);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}
	
	

	void leftRotate(int arr[], int d, int n){
		int i;
		for (i = 0; i < d; i++)
			leftRotatebyOne(arr, n);
		
	}

	void leftRotatebyOne(int arr[], int n){
		int i, temp;
		temp = arr[0];
		for (i = 0; i < n - 1; i++)
			arr[i] = arr[i + 1];
		arr[i] = temp;
	}


	void printArray(int arr[], int size){
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	}



}


