import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {
        System.out.println(countJava8("manipradeep is good as developer is "));
        System.out.println(count("manipradeep",'e'));

        Map < Character, Long > result = "manipradeep"
                .chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        result.forEach((k, v) -> {
            if (v > 1) {
                System.out.println(k + " : " + v);
            }
        });

        System.out.println('J'+'A'+'V'+'A');
    }

    public static Map<String, Integer> countJava8(String input) {
        return Pattern.compile("\\W+")
                .splitAsStream(input)
                .collect(Collectors.groupingBy(String::toLowerCase,
                        Collectors.summingInt(s -> 1)));
    }

    public static long count(String s, char ch) {
        return s.chars()
                .filter(c -> c == ch).count();
    }



}
