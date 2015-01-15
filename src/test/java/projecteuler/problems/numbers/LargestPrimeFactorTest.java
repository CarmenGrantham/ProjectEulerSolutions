package projecteuler.problems.numbers;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test LargestPrimeFactor
 * 
 * 
 * @author Carmen Grantham
 *
 */
public class LargestPrimeFactorTest {


    @Test
    public void calculate_zero_returnsZero() {
        LargestPrimeFactor factor = new LargestPrimeFactor();
        long largestPrimeFactor = factor.calculate(0);
        assertEquals(0, largestPrimeFactor);
    }


    @Test
    public void calculate_one_returnsZero() {
        LargestPrimeFactor factor = new LargestPrimeFactor();
        long largestPrimeFactor = factor.calculate(1);
        assertEquals(0, largestPrimeFactor);
    }

    
    @Test
    public void calculate_two_returnsTwo() {
        LargestPrimeFactor factor = new LargestPrimeFactor();
        long largestPrimeFactor = factor.calculate(2);
        assertEquals(2, largestPrimeFactor);
    }
    

    @Test
    public void calculate_13195_returnsTwentyNine() {
        LargestPrimeFactor factor = new LargestPrimeFactor();
        long largestPrimeFactor = factor.calculate(13195);
        assertEquals(29, largestPrimeFactor);
    }    
}
