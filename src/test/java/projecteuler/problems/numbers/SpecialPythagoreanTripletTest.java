package projecteuler.problems.numbers;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test SpecialPythagoreanTriplet
 * 
 * @author Carmen Grantham
 *
 */
public class SpecialPythagoreanTripletTest {

    @Test
    public void getProductWithExpectedSum_parameterNegative_returnsZero() {
        SpecialPythagoreanTriplet triplet = new SpecialPythagoreanTriplet();
        int result = triplet.getProductWithExpectedSum(-20);
        assertEquals(0, result);
    }


    @Test
    public void getProductWithExpectedSum_parameterZero_returnsZero() {
        SpecialPythagoreanTriplet triplet = new SpecialPythagoreanTriplet();
        int result = triplet.getProductWithExpectedSum(0);
        assertEquals(0, result);
    }
    

    @Test
    public void getProductWithExpectedSum_parameter12_returns60() {
        // 3^2 + 4^2 = 5^2 or 9 + 16 = 25
        // Use the sum of numbers to send to function: 3 + 4 + 5 = 12,  
        // Result should be product of numbers: 3 * 4 * 5 = 60 
        
        SpecialPythagoreanTriplet triplet = new SpecialPythagoreanTriplet();
        int result = triplet.getProductWithExpectedSum(12);
        assertEquals(60, result);
    }
}
