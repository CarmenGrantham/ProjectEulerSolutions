package projecteuler.problems.numbers;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Problem: The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * Notes. 
 *      Prime number: divided evenly only by 1 or itself. Must be whole number > 1
 *      Prime factor: numbers you multiply together to get another number
 * 
 * @author Carmen Grantham
 *
 */
public class LargestPrimeFactor {

    public static void main(String[] args) {
        LargestPrimeFactor factor = new LargestPrimeFactor();
        long number = 600851475143L;
        long largestPrimeFactor = factor.calculate(number);
        System.out.printf("The largest prime factor of %d is %d", number, largestPrimeFactor);
    }

    
    /**
     * Calculate the largest prime factor for a particular number.
     * 
     * @param number The number to use
     * @return The largest prime factor of the number
     */
    public long calculate(long number) {
        if (number <= 1) {
            return 0;
        }
        Set<Long> primeNumbers = getPrimeNumbers(number);
        long largestPrimeNumber = Collections.max(primeNumbers);
        return largestPrimeNumber;
    }
    
    
    /**
     * Get the list of prime factors for a number
     * @param number The number to use
     * @return A Set of all prime factors for this number
     */
    public Set<Long> getPrimeNumbers(long number) {
        Set<Long> primeNumbers = new HashSet<Long>();
        
        for (long i = 2; i <= number; i++) {
            if (number % i == 0) {
                primeNumbers.add(i);
                number = number / i;
                i--;
            }
        }      
        return primeNumbers;
    }
    
}
