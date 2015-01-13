package projecteuler.problems.numbers;

import java.util.stream.IntStream;

/**
 * Problem: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *          Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Notes. A natural number is a positive integer
 * 
 * @author Carmen Grantham
 *
 */
public class MultiplesOfThreeAndFive {

    public static void main(String[] args) {
        MultiplesOfThreeAndFive multiples = new MultiplesOfThreeAndFive();
        int lessThan = 1000;
        
        int result = multiples.calculate(lessThan);
        System.out.printf("The sum of all multiples of 3 or 5 below %d is: %d", lessThan, result);
        System.out.println();
       
        
        int lambdaResult = multiples.calculateWithLambdas(lessThan);
        System.out.printf("USING LAMBDAS: The sum of all multiples of 3 or 5 below %d is: %d", lessThan, lambdaResult);
        System.out.println();
    }
    

    /**
     * Get the sum of all numbers less than the lessThanNumber that are multiples of 3 or 5
     * 
     * @param lessThanNumber get numbers between 1 and lessThanNumber(exclusive)
     * @return sum of all numbers less than the lessThanNumber that are multiples of 3 or 5
     */
    public int calculate(int lessThanNumber) {
        int sum = 0;
        for (int i = 1; i < lessThanNumber; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }
        }
        return sum;
    }
    
    
    /**
     * Using Lambda's, get the sum of all numbers less than the lessThanNumber that are multiples of 3 or 5
     * 
     * @param lessThanNumber get numbers between 1 and lessThanNumber(exclusive)
     * @return sum of all numbers less than the lessThanNumber that are multiples of 3 or 5
     */
    public int calculateWithLambdas(int lessThanNumber) {
        int sum = IntStream.range(1, lessThanNumber)
            .filter(i -> (i % 3 == 0) || (i % 5 == 0))
            .sum();
        return sum;
    }

}
