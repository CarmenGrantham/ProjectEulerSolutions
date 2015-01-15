package projecteuler.problems.numbers;

import java.util.ArrayList;
import java.util.List;

import projecteuler.utils.NumberCalculator;

/**
 * Problem: Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 * 
 * 
 * 
 * @author Carmen Grantham
 *
 */
public class EvenFibonacciNumbers {
    
    public static void main(String[] args) {
        EvenFibonacciNumbers numbers = new EvenFibonacciNumbers();
        long maximumValue = 4000000;
        
        long result = numbers.calculate(maximumValue);
        System.out.printf("The total of even fibonacci numbers up to value %d is %d ", maximumValue, result);
    }
    

    /**
     * Calculate the total of even valued Fibonacci numbers up to maximumValue
     * 
     * @param maximumValue The larges Fibonacci number to use
     * @return Total of even valued Fibonacci numbers up to maximumValue
     */
    public long calculate(long maximumValue) {
        List<Long> numbers = getFibonacciNumbers(maximumValue);
        long sum = NumberCalculator.sumEvenNumbers(numbers);
        return sum;
    }

    
    /**
     * Get the list of Fibonacci numbers, upto the value specified in the maximumValue parameter
     * 
     * @param maximumValue Only get numbers less than or equal to this 
     * @return A list of Fibonacci numbers
     */
    public List<Long> getFibonacciNumbers(long maximumValue) {
        List<Long> numbers = new ArrayList<Long>();
        numbers.add(0L);

        if (maximumValue < 1) {
            return numbers;
        }
        
        numbers.add(1L);
        
        if (maximumValue == 1) {
            return numbers;
        }
        
        int currentIdx = numbers.size();
        long calculatedValue = 0;
        
        do {
            calculatedValue = numbers.get(currentIdx-2) + numbers.get(currentIdx-1);
            if (calculatedValue > maximumValue) {
                break;

            }
            numbers.add(calculatedValue);
            currentIdx++;
        } while (true);
        
        return numbers;
    }
    
}
