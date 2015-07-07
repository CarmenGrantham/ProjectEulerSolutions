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
    
    /**
     * Check if supplied value is an odd number, it can be either a positive or negative number
     * 
     * @param value The value to check
     * @return True if it is not divisible by 2
     */
    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }
    
    /**
     * Check if all digits within supplied value are odd.
     * 
     * @param value The value to check
     * @return True if all digits within value are odd numbers
     */
    public static boolean isAllDigitsOdd(int value) {
        if (value == 0) {
            return false;
        }
        int remainder = 0;
        while (value != 0) {
            remainder = value %10;
            if (!NumberUtils.isOdd(remainder)) {
                return false;
            }
            value = value / 10;
        }
        return true;
    }
    
    /**
     * Reverse the digits in the number so that 748 returns 847.
     * It supports negative numbers too so that -2399 return -9932
     * 
     * @param num The number to reverse
     * @return The reversed number
     */
    public static int getNumberInReverse(int num) {
        int reversedNum = 0;
        int remainder = 0;
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num = num / 10;
        }
        return reversedNum;
    }
}
