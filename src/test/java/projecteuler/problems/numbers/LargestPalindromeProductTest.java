package projecteuler.problems.numbers;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test LargestPalindromeProduct
 * 
 * @author Carmen Grantham
 *
 */
public class LargestPalindromeProductTest {


    @Test
    public void getLargest_zero_returnsMinusOne() {
        LargestPalindromeProduct product = new LargestPalindromeProduct();
        int result = product.getLargest(0);
        assertEquals(-1, result);
    }

    @Test
    public void getLargest_one_returnsNine() {
        LargestPalindromeProduct product = new LargestPalindromeProduct();
        int result = product.getLargest(1);
        assertEquals(9, result);
    }
    
    @Test
    public void getLargest_two_returns9009() {
        LargestPalindromeProduct product = new LargestPalindromeProduct();
        int result = product.getLargest(2);
        assertEquals(9009, result);
    }
    
    @Test
    public void getStartingNumber_zero_returnsMinusOne() {
        LargestPalindromeProduct product = new LargestPalindromeProduct();
        int result = product.getStartingNumber(0);
        assertEquals(-1, result);
    }
    
    @Test
    public void getStartingNumber_one_returnsOne() {
        LargestPalindromeProduct product = new LargestPalindromeProduct();
        int result = product.getStartingNumber(1);
        assertEquals(1, result);
    }
    
    @Test
    public void getStartingNumber_two_returnsTen() {
        LargestPalindromeProduct product = new LargestPalindromeProduct();
        int result = product.getStartingNumber(2);
        assertEquals(10, result);
    }
}
