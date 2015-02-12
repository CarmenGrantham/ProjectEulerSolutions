package projecteuler.problems.numbers;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test LargestProductInSeries
 * 
 * @author Carmen Grantham
 *
 */
public class LargestProductInSeriesTest {

    @Test
    public void getGreatestProduct_negativeParameter_returnsZero() {
        LargestProductInSeries calculator = new LargestProductInSeries();
        long result = calculator.getGreatestProduct(-2);
        assertEquals(0, result);
    }
    

    @Test
    public void getGreatestProduct_zeroParameter_returnsZero() {
        LargestProductInSeries calculator = new LargestProductInSeries();
        long result = calculator.getGreatestProduct(0);
        assertEquals(0, result);
    }

    
    @Test
    public void getGreatestProduct_one_returnsNine() {
        LargestProductInSeries calculator = new LargestProductInSeries();
        long result = calculator.getGreatestProduct(1);
        assertEquals(9, result);
    }

    
    @Test
    public void getGreatestProduct_four_returns5832() {
        LargestProductInSeries calculator = new LargestProductInSeries();
        long result = calculator.getGreatestProduct(4);
        assertEquals(5832, result);
    }

}
