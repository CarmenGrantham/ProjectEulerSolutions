package projecteuler.problems.numbers;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test SummationOfPrimes
 * 
 * @author Carmen Grantham
 *
 */
public class SummationOfPrimesTest {

    @Test
    public void getSumBelow_negativeParameter_returnsZero() {
        SummationOfPrimes primes = new SummationOfPrimes();
        long result = primes.getSumBelow(-12);
        assertEquals(0, result);
    }


    @Test
    public void getSumBelow_zeroParameter_returnsZero() {
        SummationOfPrimes primes = new SummationOfPrimes();
        long result = primes.getSumBelow(0);
        assertEquals(0, result);
    }
  

    @Test
    public void getSumBelow_oneParameter_returnsZero() {
        SummationOfPrimes primes = new SummationOfPrimes();
        long result = primes.getSumBelow(10);
        assertEquals(17, result);
    }

}
