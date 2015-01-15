package projecteuler.utils;

import java.util.List;

/**
 * A series of useful number calculations.
 * 
 * @author Carmen Grantham
 *
 */
public class NumberCalculator {
    
    /**
     * Calculate the total of even valued numbers in the numbers parameter.
     * If numbers list is null or empty return 0
     * 
     * @param numbers The list of numbers to use
     * @return The total of even valued numbers in the numbers parameter.
     */
    public static long sumEvenNumbers(List<Long> numbers) {
        
        if (numbers == null) {
            return 0;
        }
        
        long total = numbers.stream()
                .filter(i -> i % 2 == 0)
                .mapToLong(Long::longValue)
                .sum();
        return total;
    }
    
}
