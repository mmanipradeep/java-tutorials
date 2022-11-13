Given an array Arr[]. The task is to count the number of elements Arr[i] in the given array such that one or more smaller elements are present on
the right side of the element Arr[i] in array.
Input: Arr[] = { 3, 9, 4, 6, 7, 5 }
Output: 3
Numbers that counts are: 9, 6, 7
9 – As all numbers are present after 9 are smaller than 9,
6 – 5 is smaller element present after it,
7 – 5 is smaller element which is present after it.
Input: Arr[] = { 3, 2, 1, 2, 3, 4, 5 }
Output: 2





public int getGreateNumbers(int arr[] intarray){
int count =0;
	for(int i =0; i<= intarray.length -1 ;i++){
			for(int j=i+1; j < intaarry.length ; j++){
					if(intarray[i] > intarray[j]){
							count = count+1;
							break;
				}
		}
	}
	return count ;
}



