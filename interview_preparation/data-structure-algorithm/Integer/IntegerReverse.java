class IntegerReverse{
	
	public static void main(String args[] ){
		int number = 687;
		System.out.println(reverseInteger(number));
	}
	
	
	private static int reverseInteger(int number){
		System.out.println("Hello");	
		
		long rev =0;
		
		while(number !=0){
		//		System.out.println("rev"+number%10);
			//		System.out.println("rev"+number/10);
			rev = rev*10+(number%10);
				
			number=number/10;
		//	System.out.println("rev"+rev+"number"+number);
		}
		
		if(rev > Integer.MAX_VALUE  ||  rev < Integer.MIN_VALUE ){
			return 0;
		}
		
		return (int)rev;
	}
	
	
	
	
}