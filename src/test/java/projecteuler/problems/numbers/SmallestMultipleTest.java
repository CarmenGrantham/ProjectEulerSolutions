package projecteuler.problems.numbers;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test SmallestMultiple
 * 
 * @author Carmen Grantham
 *
 */
public class SmallestMultipleTest {

    @Test
    public void getDivisibleNumbersBetween_negativeParameters_returnsMinusOne() {
        SmallestMultiple sm = new SmallestMultiple();
        int result = sm.getDivisibleNumbersBetween(-20, -34);
        assertEquals(-1, result);
    }

    @Test
    public void getDivisibleNumbersBetween_zeroParameters_returnsMinusOne() {
        SmallestMultiple sm = new SmallestMultiple();
        int result = sm.getDivisibleNumbersBetween(0, 20);
        assertEquals(-1, result);
    }
    @Test
    public void getDivisibleNumbersBetween_oneAndTen_returns2520() {
        SmallestMultiple sm = new SmallestMultiple();
        int result = sm.getDivisibleNumbersBetween(1, 10);
        assertEquals(2520, result);
    }
}
