import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class PredicateNotTest {


    private List<String> colors;
    //private List<Cat> cats;
    private List<Integer> numbers;


    @Test
    public void test(){
        List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
        List withoutBlanks = sampleList.stream()
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());
        assertThat(withoutBlanks).containsExactly("Java", "Kotlin");

    }

    @Test
    public void assertThatColorsListContainsExpectedValues() {
        colors.add("white");
        colors.add("blue");
        colors.add("red");
//    Here we asserting if "containsExactly()" contains all exactly the same values
//    and in the same order as in the List "colors". In the "as" is the message-description,
//    that we'll see if the test will not pass.
//    We can put "as" before each method, for more readable Error messages.
        assertThat(colors)
                .as("List colors should contain exactly [\"blue\", \"white\", \"red\"]")
                .containsExactly("white", "blue", "red");
//    In this test we are checking if the List "colors" isn't empty, has size = 3,
//    does not have duplicates, contains specific values, starts with "red",
//    ends with "blue", etc.
//    It is pretty awesome, that it is obvious even for a non-technical person, isn't it?:)
        assertThat(colors)
                .isNotEmpty()
                .hasSize(3)
                .doesNotHaveDuplicates()
                .contains("white", "blue", "red")
                .endsWith("red")
                .startsWith("white")
                .containsSequence("white", "blue")
                .containsExactly("white", "blue", "red")
                .doesNotContain("black", "orange");
    }

}
