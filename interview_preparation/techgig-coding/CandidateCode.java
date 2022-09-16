import java.io.;
import java.util.;
public class CandidateCode { 

		public static void main(String args[] ) throws Exception { 
			int n;  
			Scanner sc=new Scanner(System.in);  
			n=sc.nextInt();  
			int[] array = new int[10];  
				for(int i=0; i<n; i++)  {  
						array[i]=sc.nextInt();  
				}  
				for (int i=0; i<n; i++)   {  
					System.out.println(array[i]);  
				}  
		}

}