import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAllPalindrome
{
	static boolean isPalindrome(String s, int low, int high) 
        {
            while (low < high) {
                if (s.charAt(low++) != s.charAt(high--)) return false;
            }
            return true;
        }
        static void dfs(int start, List<List<String>> r, List<String> c, String s) 
        {
            if (start >= s.length()) 
            {
                r.add(new ArrayList<String>(c));
            }
            for (int end = start; end < s.length(); end++) {
                if(isPalindrome(s, start, end)) 
                {
                    c.add(s.substring(start, end + 1));
                    dfs(end + 1, r, c, s);
                    c.remove(c.size() - 1);
                }
            }
        }
        
  public static void main(String[] args) 
  { 
    Scanner sr = new Scanner(System.in); 
                String s = sr.next();
                List<List<String>> r = new ArrayList<List<String>>();
                List<String> c = new ArrayList<String>();
                dfs(0, r, c, s);
                for(int i=0;i<r.size();i++)
                {
                    for(int j=0;j<r.get(i).size();j++)
                    {
                        System.out.print(r.get(i).get(j).toString());
                        System.out.print(" ");
                    }
                    System.out.println();
                }
  } 
}

// This code is contributed by Prerna Saini
