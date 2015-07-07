package projecteuler.problems.numbers;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test ReversibleNumbers class
 * 
 * @author Carmen Grantham
 *
 */
public class ReversibleNumbersTest {

    @Test
    public void getReversibleNumbersCount_zero_returnsZero() {
        ReversibleNumbers numbers = new ReversibleNumbers();
        long count = numbers.getReversibleNumbersCount(0);
        assertEquals(0, count);
    }
    

    @Test
    public void getReversibleNumbersCount_nine_returnsZero() {
        ReversibleNumbers numbers = new ReversibleNumbers();
        long count = numbers.getReversibleNumbersCount(9);
        assertEquals(0, count);
    }    
    
    @Test
    public void getReversibleNumbersCount_20_returnsZero() {
        ReversibleNumbers numbers = new ReversibleNumbers();
        long count = numbers.getReversibleNumbersCount(20);
        assertEquals(0, count);
    }
    
    @Test
    public void getReversibleNumbersCount_1000_returns120() {
        ReversibleNumbers numbers = new ReversibleNumbers();
        long count = numbers.getReversibleNumbersCount(1000);
        assertEquals(120, count);
    }
    
    
}
