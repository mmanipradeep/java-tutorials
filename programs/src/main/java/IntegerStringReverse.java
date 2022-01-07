import java.util.Stack;

public class IntegerStringReverse {
    public static void main(String[] args) {
        System.out.println(IntegerStringReverse.stringReverse("manipradeep"));
        System.out.println(IntegerStringReverse.integerReverse(-16));
    }

    private static int  integerReverse(int number) {
        boolean isNegative = number < 0 ? true : false;
        if (isNegative) {
            number = number * -1;
        }
        int reverse = 0;
        int lastDigit = 0;
        while (number >= 1) {
            lastDigit = number % 10; // gives you last digit
            reverse = reverse * 10 + lastDigit;
            number = number / 10; // get rid of last digit }

        }
//        return isNegative == true? reverse*-1 : reverse;
        return reverse;
    }

    private static String stringReverse(String s){
        char ch[] = s.toCharArray();
        String reverveString ="";
        for(int i=ch.length-1;i>=0;i--){
            reverveString +=ch[i];
        }
        return reverveString;
    }


    private static String reverseUsingStack(String string){
        // base case: if the string is null or empty
        if (string == null || string.equals("")) {
            return string;
        }
            Stack<Character> stack = new Stack<>();
                char[] ch = string.toCharArray();
                 for (int i = 0; i < string.length(); i++) {
            stack.push(ch[i]);
        }
        int k = 0;
        while (!stack.isEmpty()) {
            // assign each popped character back to the character array
            ch[k++] = stack.pop();
        }

        // convert the character array into a string and return it
        return String.copyValueOf(ch);
    }

}
