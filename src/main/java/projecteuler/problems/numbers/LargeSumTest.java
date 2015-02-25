package projecteuler.problems.numbers;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

/**
 * Tests for LargeSum
 * 
 * @author Carmen Grantham
 *
 */
public class LargeSumTest {

    @Test
    public void getSum_emptyArray_returnsZero() {
        LargeSum largeSum = new LargeSum();
        BigInteger[] numbers = {};
        BigInteger result = largeSum.getSum(numbers);
        assertEquals(BigInteger.valueOf(0), result);
    }

    @Test
    public void getSum_nullArray_returnsZero() {
        LargeSum largeSum = new LargeSum();
        BigInteger result = largeSum.getSum(null);
        assertEquals(BigInteger.valueOf(0), result);
    }


    @Test
    public void getSum_threeElementArray_returnsEleven() {
        LargeSum largeSum = new LargeSum();
        BigInteger[] numbers = { 
                new BigInteger("3"),
                new BigInteger("4"),
                new BigInteger("4")
        };
        BigInteger result = largeSum.getSum(numbers);
        assertEquals(BigInteger.valueOf(11), result);
    }

}
