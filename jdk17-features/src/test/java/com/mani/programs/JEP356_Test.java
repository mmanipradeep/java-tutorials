package com.mani.programs;
import com.mani.programes.JEP356;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class JEP356_Test {
    @Test
    void getPseudoInts_whenUsingAlgorithmXoroshiro128PlusPlus_shouldReturnStreamOfRandomInteger() {
        var algorithm = "Xoshiro256PlusPlus";
        var streamSize = 100;
        JEP356 jep356 = new JEP356();
        jep356.getPseudoInts(algorithm, streamSize)
                .forEach(value -> assertThat(value).isLessThanOrEqualTo(99));
    }

    @Test
    void getAllAlgorithms(){
        JEP356 jep356 = new JEP356();

        System.out.println(jep356.getAllAlgorithms());
    }
}
