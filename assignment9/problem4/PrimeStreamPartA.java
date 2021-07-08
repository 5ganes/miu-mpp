package assignment9.problem4;

import java.math.BigInteger;
import java.util.stream.Stream;

public class PrimeStreamPartA {

    public static void main(String[] args) {

        final Stream<BigInteger> primes = Stream.iterate(BigInteger.TWO, BigInteger::nextProbablePrime);
        primes.forEach(System.out::println);

    }

}
