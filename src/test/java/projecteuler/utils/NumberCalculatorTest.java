package projecteuler.utils;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Test NumberCalculator
 * 
 * @author Carmen Grantham
 *
 */
public class NumberCalculatorTest {

    @Test
    public void sumEvenNumbers_nullList_returnsZero() {
        List<Long> numbers = null;
        long result = NumberCalculator.sumEvenNumbers(numbers);
        assertEquals(0, result);
    }
    
    
    @Test
    public void sumEvenNumbers_emptyList_returnsZero() {
        List<Long> numbers = new ArrayList<Long>();
        long result = NumberCalculator.sumEvenNumbers(numbers);
        assertEquals(0, result);
    }

    
    @Test
    public void sumEvenNumbers_noEvenNumbersList_returnsZero() {
        List<Long> numbers = new ArrayList<Long>();
        numbers.add(1L);
        numbers.add(43L);
        numbers.add(17L);
        long result = NumberCalculator.sumEvenNumbers(numbers);
        assertEquals(0, result);
    }
    

    @Test
    public void sumEvenNumbers_onlyTwo_returnsTwo() {
        List<Long> numbers = new ArrayList<Long>();
        numbers.add(2L);
        long result = NumberCalculator.sumEvenNumbers(numbers);
        assertEquals(2, result);
    }
    

    @Test
    public void sumEvenNumbers_multipleValues_returnsNinetyTwo() {
        List<Long> numbers = new ArrayList<Long>();
        numbers.add(1L);
        numbers.add(54L);
        numbers.add(18L);
        numbers.add(20L);
        numbers.add(189L);
        long result = NumberCalculator.sumEvenNumbers(numbers);
        assertEquals(92, result);
    }
    
    
}
