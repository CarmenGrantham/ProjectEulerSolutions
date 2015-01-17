package projecteuler.problems.numbers;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test SumSquareDifference
 * 
 * @author Carmen Grantham
 *
 */
public class SumSquareDifferenceTest {

    @Test
    public void calculate_zero_returnsZero() {
        SumSquareDifference diff = new SumSquareDifference();
        int result = diff.calculate(0);
        assertEquals(0, result);
    }

    @Test
    public void calculate_ten_returns2640() {
        SumSquareDifference diff = new SumSquareDifference();
        int result = diff.calculate(10);
        assertEquals(2640, result);
    }

    @Test
    public void getSumOfSquares_zero_returnsZero() {
        SumSquareDifference diff = new SumSquareDifference();
        int result = diff.getSumOfSquares(0);
        assertEquals(0, result);
    }

    @Test
    public void getSumOfSquares_ten_returns385() {
        SumSquareDifference diff = new SumSquareDifference();
        int result = diff.getSumOfSquares(10);
        assertEquals(385, result);
    }

    @Test
    public void getSquareOfSums_zero_returnsZero() {
        SumSquareDifference diff = new SumSquareDifference();
        int result = diff.getSquareOfSums(0);
        assertEquals(0, result);
    }

    @Test
    public void getSquareOfSums_ten_returns3025() {
        SumSquareDifference diff = new SumSquareDifference();
        int result = diff.getSquareOfSums(10);
        assertEquals(3025, result);
    }
}
