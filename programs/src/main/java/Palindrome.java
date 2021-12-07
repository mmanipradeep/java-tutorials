import java.util.stream.IntStream;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("madam"));

    }


    private static boolean isPalindrome(String s){
        String text ="madam";
        String temp  = text.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }

    private static boolean isPalindromeInteger(int number){
        return number == IntStream.iterate(number, i -> i / 10)
                .map(n -> n % 10)
                .limit(String.valueOf(number).length())
                .reduce(0, (a, b) -> a = a * 10 + b);
    }
}
