import java.util.*;

class ArrayTest {
	
	public static void main(String args[]){

		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4));
		for(int i=0;i<a.size();i++)
			a.remove(i);
		System.out.println(a);
	}

}

//Output : [2, 4]