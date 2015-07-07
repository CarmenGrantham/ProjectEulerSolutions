package projecteuler.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

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
    
    @Test
    public void isOdd_one_returnsTrue() {
        boolean result = NumberUtils.isOdd(1);
        assertTrue(result);
    }

    @Test
    public void isOdd_26_returnsFalse() {
        boolean result = NumberUtils.isOdd(26);
        assertFalse(result);
    }
    
    @Test
    public void isOdd_negative33_returnsTrue() {
        boolean result = NumberUtils.isOdd(-33);
        assertTrue(result);
    }


    @Test
    public void isOdd_negative100_returnsFalse() {
        boolean result = NumberUtils.isOdd(-100);
        assertFalse(result);
    }

    @Test
    public void isAllDigitsOdd_10_returnsFalse() {
        boolean result = NumberUtils.isAllDigitsOdd(10);
        assertFalse(result);
    }

    @Test
    public void isAllDigitsOdd_99_returnsTrue() {
        boolean result = NumberUtils.isAllDigitsOdd(99);
        assertTrue(result);
    }

    @Test
    public void isAllDigitsOdd_zero_returnsFalse() {
        boolean result = NumberUtils.isAllDigitsOdd(0);
        assertFalse(result);
    }

    @Test
    public void getNumberInReverse_13_returns31() {
        int num = NumberUtils.getNumberInReverse(13);
        assertEquals(31, num);
    }    


    @Test
    public void getNumberInReverse_negative456_returnsNegative654() {
        int num = NumberUtils.getNumberInReverse(-456);
        assertEquals(-654, num);
    }
    
    @Test
    public void getNumberInReverse_100_returns1() {
        int num = NumberUtils.getNumberInReverse(100);
        assertEquals(1, num);
    }    
    

    @Test
    public void getNumberInReverse_zero_returns1() {
        int num = NumberUtils.getNumberInReverse(0);
        assertEquals(0, num);
    }    
    
}
