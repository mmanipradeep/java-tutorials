import java.util.HashSet;
import java.util.Set;

public class FindPalindrome {

    private Set<String> palindrome = new HashSet<>();

    public static void main(String[] args) {

        FindPalindrome findPalindrome = new FindPalindrome();
        findPalindrome.findPalindrome("ABACHCABCC");
        findPalindrome.print();

    }

    public void findPalindrome(String str) {
        if (str.length() == 1) {
            return;
        }
        int x = str.length() / 2;
        String str1 = str.substring(0, x);
        String str2 = str.replaceFirst(str1, "");
        for (int i = x; i >= 0; i--) {
            for (int j = 1; j <= str2.length(); j++) {
                String testPalindrome = str1.substring(i, str1.length())
                        + str2.substring(0, j);
                if (testPalindrome.length() > 1
                        && isPalindrome(testPalindrome)) {
                    palindrome.add(testPalindrome);
                }
            }
        }

        findPalindrome(str1);
        findPalindrome(str2);
    }

    public boolean isPalindrome(String str) {
        char[] ch1 = str.toCharArray();
        char[] ch2 = str.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            ch2[i] = ch1[ch1.length - i - 1];
        }
        String revString = String.valueOf(ch2);

        return str.equals(revString);

    }

    public void print() {
        System.out.println("Total count of Palindrome: " + palindrome.size());
        palindrome.forEach(System.out::println);
    }
}
