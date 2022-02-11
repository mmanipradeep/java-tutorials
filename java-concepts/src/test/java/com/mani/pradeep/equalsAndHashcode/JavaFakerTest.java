package com.mani.pradeep.equalsAndHashcode;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.LocaleDoesNotExistException;
import com.github.javafaker.service.RandomService;
import org.junit.Test;

import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JavaFakerTest {

    @Test
    public void whenBothifyCalled_checkPatternMatches() throws Exception {

        FakeValuesService fakeValuesService = new FakeValuesService(
                new Locale("en-GB"), new RandomService());
        String email = fakeValuesService.bothify("????##@gmail.com");
        System.out.println(email);
        Matcher emailMatcher = Pattern.compile("\\w{4}\\d{2}@gmail.com").matcher(email);
        assertTrue(emailMatcher.find());
    }

    @Test
    public void givenValidService_whenRegexifyCalled_checkPattern() throws Exception {


        Faker faker = new Faker();

        String streetName = faker.address().streetName();
        String number = faker.address().buildingNumber();
        String city = faker.address().city();
        String country = faker.address().country();

        System.out.println(String.format("%s\n%s\n%s\n%s",
                number,
                streetName,
                city,
                country));

        FakeValuesService fakeValuesService = new FakeValuesService(
                new Locale("en-GB"), new RandomService());

        String alphaNumericString = fakeValuesService.regexify("[a-z1-9]{10}");
        Matcher alphaNumericMatcher = Pattern.compile("[a-z1-9]{10}").matcher(alphaNumericString);

        assertTrue(alphaNumericMatcher.find());
    }

    @Test
    public void givenJavaFakersWithDifferentLocals_thenHeckZipCodesMatchRegex() {

        Faker ukFaker = new Faker(new Locale("en-GB"));
        Faker usFaker = new Faker(new Locale("en-US"));

        System.out.println(String.format("American zipcode: %s", usFaker.address().zipCode()));
        System.out.println(String.format("British postcode: %s", ukFaker.address().zipCode()));

        Pattern ukPattern = Pattern.compile(
                "([Gg][Ii][Rr] 0[Aa]{2})|((([A-Za-z][0-9]{1,2})|"
                        + "(([A-Za-z][A-Ha-hJ-Yj-y][0-9]{1,2})|(([A-Za-z][0-9][A-Za-z])|([A-Za-z][A-Ha-hJ-Yj-y]"
                        + "[0-9]?[A-Za-z]))))\\s?[0-9][A-Za-z]{2})");
        Matcher ukMatcher = ukPattern.matcher(ukFaker.address().zipCode());

        assertTrue(ukMatcher.find());

        Matcher usMatcher = Pattern.compile("^\\d{5}(?:[-\\s]\\d{4})?$")
                .matcher(usFaker.address().zipCode());

        assertTrue(usMatcher.find());
    }


@Test(expected = LocaleDoesNotExistException.class)
    public void givenWrongLocale_whenFakerInitialised_testExceptionThrown() {
        Faker wrongLocaleFaker = new Faker(new Locale("en-seaWorld"));
    }

    @Test
    public void givenJavaFakersWithSameSeed_whenNameCalled_CheckSameName() {

        Faker faker1 = new Faker(new Random(24));
        Faker faker2 = new Faker(new Random(24));

        assertEquals(faker1.name().firstName(), faker2.name().firstName());
    }
}
