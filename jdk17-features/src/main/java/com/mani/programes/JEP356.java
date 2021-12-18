package com.mani.programes;


import java.util.random.RandomGeneratorFactory;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Random;
import java.util.SplittableRandom;
import java.security.SecureRandom;

//Pseudo-Random Number Generators (PRNG).
      //  Thus, it's easier to use different algorithms interchangeably, and it also offers better support for stream-based programming,
//Legacy random classes, such as java.util.Random, SplittableRandom, and SecureRandom, now extend the new RandomGenerator interface.
public class JEP356 {

    //List of Algorithms - https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/random/package-summary.html
    public Stream<String> getAllAlgorithms() {
        return RandomGeneratorFactory.all().map(RandomGeneratorFactory::name);
    }

    public IntStream getPseudoInts(String algorithm, int streamSize) {
        // returns an IntStream with size @streamSize of random numbers generated using the @algorithm
        // where the lower bound is 0 and the upper is 100 (exclusive)
        return RandomGeneratorFactory.of(algorithm)
                .create()
                .ints(streamSize, 0,100);
    }
}
