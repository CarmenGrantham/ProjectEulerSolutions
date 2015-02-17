package projecteuler.utils;

import java.util.Arrays;
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
    
    /**
     * Get the sum of all values.
     * 
     * @param values The values to add together
     * @return Total of values added together, if values is null return 0
     */
    public static int getSum(int... values ) {
        if (values == null) {
            return 0;
        }
        return Arrays.stream(values).sum();
    }
    
    /**
     * Get the product of all values.
     * 
     * @param values The values to multiply together
     * @return Total of values multiplied together, if values is null return 0
     */
    public static int getProduct(int... values) {
        if (values == null) {
            return 0;
        }
        return Arrays.stream(values).reduce((x,y) -> {return x*y;}).getAsInt();
    }

}
