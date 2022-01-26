package com.program.strings;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class StringReverseTest {
    StringReverse s = new StringReverse();
    @Test
    public void test() {

        assertEquals("cba", s.reverse("abc"));
        assertEquals("", s.reverse(""));
        assertNotEquals("abc", s.reverse("abc"));

    }

    @Test
    public void SnakeToUnderscore(){
        assertEquals("this_is_a_sample_question_and_answer_should_be_y_or_n",
                s.camelCase2Underscore("thisIsASampleQuestionAndAnswerShouldBeYOrN"));
    }

    @Test
    public void underscore(){
        assertEquals("thisIsASampleQuestionAndAnswerShouldBeYOrN",
                s.underScoreToCamel("this_is_a_sample_question_and_answer_should_be_y_or_n"));
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testThrowNPE(){
        StringReverse s = new StringReverse();
        s.reverse(null);
    }
}
