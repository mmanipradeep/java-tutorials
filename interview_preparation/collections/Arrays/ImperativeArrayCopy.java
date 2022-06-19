import  java.util.Arrays;
import java.util.stream.*;
import java.util.concurrent.atomic.*;

class ImperativeArrayCopy {
	
	public static void main(String args[]){
		
			int[] numbers = {1,2,3,4,5,6,7};
		copyArrayImperative(numbers);
		copyofRangeArray(numbers);
		copyArrayDeclarative(numbers);
		
		copyUsingIndex(numbers);
		copyUsingAtomic(numbers);
		
	}
	
	private static int [] copyArrayImperative(int[] numbers){
		
		int [] subArray = new int [numbers.length -3 ];
		int j = 3 ;
		for (int i=0;i<subArray.length;i++){
			subArray[i]=numbers[j+i];
		}
	System.out.println("Imperateive Approach -->  "+Arrays.toString(subArray));
	return subArray;
		
	}
	
	private static int[] copyofRangeArray(int [] numbers){
		int [] subArray =Arrays.copyOfRange(numbers,3,numbers.length);
		System.out.println("CopyOfReange ---> "+Arrays.toString(subArray));
		return subArray;
		
	}
	
	private static int [] copyArrayDeclarative(int [] numbers){
		
		int [] subArray = Arrays.stream(numbers).filter(a-> a>3).toArray();
		System.out.println("Declarative way --> "+Arrays.toString(subArray));		return subArray;
	}
	
	private static int [] copyUsingIndex(int [] numbers){
		int[] subArray = IntStream.range(0,numbers.length).filter(i->i>3).map(a->numbers[a]).toArray();
		System.out.println("CopyusingIndex --> "+Arrays.toString(subArray));		return subArray;
		
	}
	
	private static int [] copyUsingAtomic(int [] numbers){
		
		AtomicInteger atomicInteger =new AtomicInteger();
		int[] subArray =Arrays.stream(numbers).filter(i-> atomicInteger.getAndIncrement()>3).toArray();
		System.out.println(" CopyUsingAtomicInteger  -->"+Arrays.toString(subArray));		return subArray;
		
	}
	
	
	
}