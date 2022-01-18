import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OptionalExampleTest    {



    @Test
    public void testAdd() {
        String str = "Junit is working fine";
        assertEquals("Junit is working fine",str);
    }

//    //@Test
//    public void whenCreatesEmptyOptional_thenCorrect() {
//        Optional<String> empty = Optional.empty();
//        assertFalse(empty.isPresent());
//    }
//
//    //@Test
//    public void OptionalTest() throws Exception {
//        List<Integer> marks = new ArrayList<>();
//        marks.add(45);
//        marks.add(66);
//        marks.add(65);
//        Map<String,List<Integer>> gradeList = new HashMap<>();
//        gradeList.put("mani",marks);
//        optionalExample.calculateAverageGrade(gradeList,"mani");
//    }
}
