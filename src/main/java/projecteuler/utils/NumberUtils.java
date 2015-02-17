package projecteuler.utils;

/**
 * A collection of helpful utilities for number parameters.
 * 
 * @author Carmen Grantham
 *
 */
public class NumberUtils {
    
    /**
     * Check if long is a prime or not, ie only divisible by itself and 1.
     * 
     * @param number the long to check
     * @return True if long is a prime number, otherwise false
     */
    public static boolean isPrimeNumber(long number) {
        // all values less than or equal to 1 are not primes
        if (number <= 1) {
            return false;
        }
        
        // 2 and 3 are prime numbers
        if (number == 2 || number == 3) {
            return true;
        }
        // if even number (and not 2 as checked above) then it's not a prime
        if (number % 2 == 0) {
            return false;
        }
        
        // already accounted for values upto 2 and even numbers, so check odd numbers
        for (int i = 3; i*i <= number; i+=2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;        
    }
}
