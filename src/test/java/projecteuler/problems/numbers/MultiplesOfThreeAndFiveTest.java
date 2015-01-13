package projecteuler.problems.numbers;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test MultiplesOfThreeAndFive class.
 * 
 * @author Carmen Grantham
 *
 */
public class MultiplesOfThreeAndFiveTest {

    @Test
    public void calculate_ten_returnsTwentyThree() {
        MultiplesOfThreeAndFive multiples = new MultiplesOfThreeAndFive();
        int lessThanNumber = 10;
        int result = multiples.calculate(lessThanNumber);
        assertEquals(23, result);
    }

    @Test
    public void calculate_negative_returnsZero() {
        MultiplesOfThreeAndFive multiples = new MultiplesOfThreeAndFive();
        int lessThanNumber = -10;
        int result = multiples.calculate(lessThanNumber);
        assertEquals(0, result);
    }

    @Test
    public void calculate_one_returnsZero() {
        MultiplesOfThreeAndFive multiples = new MultiplesOfThreeAndFive();
        int lessThanNumber = 1;
        int result = multiples.calculate(lessThanNumber);
        assertEquals(0, result);
    }

    @Test
    public void calculateWithLambdas_ten_returnsTwentyThree() {
        MultiplesOfThreeAndFive multiples = new MultiplesOfThreeAndFive();
        int lessThanNumber = 10;
        int result = multiples.calculateWithLambdas(lessThanNumber);
        assertEquals(23, result);
    }

    @Test
    public void calculateWithLambdas_negative_returnsZero() {
        MultiplesOfThreeAndFive multiples = new MultiplesOfThreeAndFive();
        int lessThanNumber = -10;
        int result = multiples.calculateWithLambdas(lessThanNumber);
        assertEquals(0, result);
    }

    @Test
    public void calculateWithLambdas_one_returnsZero() {
        MultiplesOfThreeAndFive multiples = new MultiplesOfThreeAndFive();
        int lessThanNumber = 1;
        int result = multiples.calculateWithLambdas(lessThanNumber);
        assertEquals(0, result);
    }

}
