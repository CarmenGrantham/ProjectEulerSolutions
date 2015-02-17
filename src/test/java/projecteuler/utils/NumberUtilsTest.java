package projecteuler.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import projecteuler.problems.numbers.TenThousandAndFirstPrime;

/**
 * Test NumberUtils
 * 
 * @author Carmen Grantham
 *
 */
public class NumberUtilsTest {
    
    @Test
    public void isPrimeNumber_zero_returnsFalse() {
        boolean result = NumberUtils.isPrimeNumber(0);
        assertFalse(result);
    }   
    
    
    @Test
    public void isPrimeNumber_two_returnsTrue() {
        boolean result = NumberUtils.isPrimeNumber(2);
        assertTrue(result);
    }        
    
    
    @Test
    public void isPrimeNumber_four_returnsFalse() {
        boolean result = NumberUtils.isPrimeNumber(4);
        assertFalse(result);
    }
    
    
    @Test
    public void isPrimeNumber_fifteen_returnsFalse() {
        boolean result = NumberUtils.isPrimeNumber(15);
        assertFalse(result);
    }   
}
