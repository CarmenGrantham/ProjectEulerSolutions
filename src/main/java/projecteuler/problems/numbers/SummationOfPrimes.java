package projecteuler.problems.numbers;

import java.util.stream.LongStream;

import projecteuler.utils.NumberUtils;

/**
 * Problem: The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 * 
 * @author Carmen Grantham
 *
 */
public class SummationOfPrimes {

    public static void main(String[] args) {
        SummationOfPrimes primes = new SummationOfPrimes();
        long maximum = 2000000;
        long result = primes.getSumBelow(maximum);
        System.out.printf("The sum of primes below %d is %d", maximum, result);
    }
    
    /**
     * Get the sum of prime numbers below the long
     * 
     * @param lessThanNumber get prime numbers between 1 and long(exclusive) 
     * @return Sum of prime numbers between 1 and long(exclusive)
     */
    public long getSumBelow(long lessThanNumber) {
        if (lessThanNumber <= 0) {
            return 0;
        }

        long total = LongStream.range(1, lessThanNumber)
                .filter(i -> NumberUtils.isPrimeNumber(i))
                .sum();
        
        return total;
    }
}
