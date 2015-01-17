package projecteuler.problems.numbers;

/**
 * Problem: 
 * 
 * The sum of the squares of the first ten natural numbers is,
 *      1^2 + 2^2 + ... + 10^2 = 385
 *
 * The square of the sum of the first ten natural numbers is,
 *      (1 + 2 + ... + 10)^2 = 55^2 = 3025
 *
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 *
 * 
 * @author Carmen Grantham
 *
 */
public class SumSquareDifference {

    public static void main(String[] args) {
        SumSquareDifference diff = new SumSquareDifference();
        int result = diff.calculate(100);
        System.out.printf("Sum of square difference is %d", result );
    }
    
    
    /**
     * Calculate the difference between the square of the sum and the sum of the squares.
     * 
     * @param maximumValue The maximum value to use
     * @return The difference between the square of the sum and the sum of the squares.
     */
    public int calculate(int maximumValue) {
        int sumOfSquares = getSumOfSquares(maximumValue);
        int squareOfSums = getSquareOfSums(maximumValue);
        int result = squareOfSums - sumOfSquares;
        return result;
    }
    
    
    /**
     * Add up all the square values from 1 to maximumValue. 
     * ie. 1^1 + 2^2 + ... maximumValue^maximumValue
     * 
     * @param maximumValue The maximum value to use
     * @return The total of square values from 1 to maximumValue
     */
    public int getSumOfSquares(int maximumValue) {
        int total = 0;
        for (int i = 1; i <= maximumValue; i++) {
            total += (i * i);
        }
        return total;
    }
    
    
    /**
     * Add up all the numbers from 1 to maximumValue and square them.
     * 
     * @param maximumValue The maximum value to use.
     * @return The total of 1 to maximumValue squared.
     */
    public int getSquareOfSums(int maximumValue) {
        int total = 0;
        for (int i = 1; i <= maximumValue; i++) {
            total += i;
        }
        // square the total
        total = total * total;
        
        return total;        
    }

}
