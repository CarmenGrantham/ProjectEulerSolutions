package projecteuler.problems.numbers;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

/**
 * Test EvenFibonacciNumbers
 * 
 * @author Carmen Grantham
 *
 */
public class EvenFibonacciNumbersTest {
    

    @Test
    public void calculate_zero_returnsZero() {
        EvenFibonacciNumbers numbers = new EvenFibonacciNumbers();
        long result = numbers.calculate(0L);
        assertEquals(0, result);
    }
    

    @Test
    public void calculate_one_returnsOne() {
        EvenFibonacciNumbers numbers = new EvenFibonacciNumbers();
        long result = numbers.calculate(1L);
        assertEquals(0, result);
    }

    
    @Test
    public void calculate_oneHundred_returnsFortyFour() {
        EvenFibonacciNumbers numbers = new EvenFibonacciNumbers();
        long result = numbers.calculate(100L);
        assertEquals(44, result);
    }

    
    @Test
    public void getFibonacciNumbers_zero_returnsOneValueArray() {
        EvenFibonacciNumbers numbers = new EvenFibonacciNumbers();
        List<Long> list = numbers.getFibonacciNumbers(0);
        assertEquals(1, list.size());
    }

    
    @Test
    public void getFibonacciNumbers_oneHundred_returnsOneValueArray() {
        EvenFibonacciNumbers numbers = new EvenFibonacciNumbers();
        List<Long> list = numbers.getFibonacciNumbers(100);
        assertEquals(12, list.size());
    }

}
