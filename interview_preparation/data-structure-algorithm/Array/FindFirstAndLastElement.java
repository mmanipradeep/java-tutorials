import java.util.ArrayList;

class FindFirstAndLastElement {
	
	public static void main (String args[]) {
		int  arr []   = {2,4,5,6,7,7,7,9};
		ArrayList arrayList = new ArrayList();
		for (int i  : arr)
			arrayList.add(i);
		
		System.out.println(FindFirst(7,arrayList));
		System.out.println(FindLast(7,arrayList));

		
	}
	
	private static int FindFirst(int  number , ArrayList list ){
		return list.indexOf(number);
	}
	
	private static  int FindLast(int  number , ArrayList list){
	return list.lastIndexOf(number);
	}
}