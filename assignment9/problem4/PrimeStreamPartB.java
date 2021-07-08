package assignment9.problem4;

import java.math.BigInteger;
import java.util.stream.Stream;

public class PrimeStreamPartB {

    public static void main(String[] args) {
        PrimeStreamPartB ps = new PrimeStreamPartB(); //PrimeStream is enclosing class
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }

    public static void printFirstNPrimes(int n){
        final Stream<BigInteger> primes = Stream.iterate(BigInteger.TWO, BigInteger::nextProbablePrime);
        primes.limit(n).forEach(System.out::println);
    }

}
