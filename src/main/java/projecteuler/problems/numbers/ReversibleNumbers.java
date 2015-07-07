package projecteuler.problems.numbers;

import java.util.stream.IntStream;

import projecteuler.utils.NumberUtils;

/**
 * Problem 145: Some positive integers n have the property that the sum [ n + reverse(n) ]
 * consists entirely of odd (decimal) digits. For instance, 36 + 63 = 99 and 409 + 904 = 1313. 
 * We will call such numbers reversible; so 36, 63, 409, and 904 are reversible. Leading 
 * zeroes are not allowed in either n or reverse(n).
 * 
 * There are 120 reversible numbers below one-thousand.
 * 
 * How many reversible numbers are there below one-billion (109)?
 * 
 * 
 * @author Carmen Grantham
 *
 */
public class ReversibleNumbers {

    public static void main(String[] args) {
        int maximumNumber = 1000000000;
        ReversibleNumbers numbers = new ReversibleNumbers();
        long reversibleCount = numbers.getReversibleNumbersCount(maximumNumber);
        System.out.printf("The sum of a number under %d and it's reversed number that sum to an all odd digits number is %d", maximumNumber, reversibleCount);
    }
    
    /**
     * Get the number of instances where a number and it's reverse add up
     * to a number where all digits are odd.
     * 
     * @param maximum The maximum value to loop to
     * @return Number of instances
     */
    public long getReversibleNumbersCount(int maximum) {
        
        // Numbers must have at least 2 digits to proceed
        if (maximum <= 10) {
            return 0;
        }
        int start = 11;
        
        long count = IntStream.rangeClosed(start, maximum)
                .filter(num -> isNotMultipleOfTen(num))
                .filter(num -> isReverseSumOddNumber(num, maximum))
                .count();
        return count;
        
    }
    
    /**
     * Check if provided num is not a multiple of 10.
     * Eg 10 will return false, 3 will return true.
     * 
     * @param num The number to check
     * @return True if num is not a multiple of 10.
     */
    private boolean isNotMultipleOfTen(int num) {
        return num % 10 != 0;
    }
    
    /**
     * Check if provided num and it's reverse when added together create
     * a number where all digits are odd.
     * 
     * @param num The number to check
     * @param maximum The reversed number must be less than this value
     * @return True if sum of number and it's reverse return value with all odd numbers. 
     */
    private boolean isReverseSumOddNumber(int num, int maximum) {
        int reverseNum = NumberUtils.getNumberInReverse(num);
        if (reverseNum > 10 && reverseNum < maximum) {
            int sum = num + reverseNum;
            return (NumberUtils.isAllDigitsOdd(sum));
        }
        return false;        
    }
}
