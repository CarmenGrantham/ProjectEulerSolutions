package projecteuler.problems.numbers;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test TenThousandAndFirstPrime
 * @author Carmen Grantham
 *
 */
public class TenThousandAndFirstPrimeTest {

    @Test
    public void getPrimeNumber_negative_returnsZero() {
        TenThousandAndFirstPrime prime = new TenThousandAndFirstPrime();
        int number = -20;
        int result = prime.getPrimeNumberInSequence(number);
        assertEquals(0, result);
    }

    
    @Test
    public void getPrimeNumber_zero_returnsZero() {
        TenThousandAndFirstPrime prime = new TenThousandAndFirstPrime();
        int number = 0;
        int result = prime.getPrimeNumberInSequence(number);
        assertEquals(0, result);
    }

    
    @Test
    public void getPrimeNumber_one_returnsTwo() {
        TenThousandAndFirstPrime prime = new TenThousandAndFirstPrime();
        int number = 1;
        int result = prime.getPrimeNumberInSequence(number);
        assertEquals(2, result);
    }

    
    @Test
    public void getPrimeNumber_two_returnsTwo() {
        TenThousandAndFirstPrime prime = new TenThousandAndFirstPrime();
        int number = 2;
        int result = prime.getPrimeNumberInSequence(number);
        assertEquals(3, result);
    }
    

    @Test
    public void getPrimeNumber_six_returnsThirteen() {
        TenThousandAndFirstPrime prime = new TenThousandAndFirstPrime();
        int number = 6;
        int result = prime.getPrimeNumberInSequence(number);
        assertEquals(13, result);
    }  

    
    @Test
    public void getPrimeNumber_tenThousandAndOne_returnsThirteen() {
        TenThousandAndFirstPrime prime = new TenThousandAndFirstPrime();
        int number = 10001;
        int result = prime.getPrimeNumberInSequence(number);
        assertEquals(104743, result);
    }


    @Test
    public void getNextPrimeNumber_two_returnsThree() {
        TenThousandAndFirstPrime prime = new TenThousandAndFirstPrime();
        int number = 2;
        int result = prime.getNextPrimeNumber(number);
        assertEquals(3, result);
    }        


    @Test
    public void getNextPrimeNumber_seven_returnsEleven() {
        TenThousandAndFirstPrime prime = new TenThousandAndFirstPrime();
        int number = 7;
        int result = prime.getNextPrimeNumber(number);
        assertEquals(11, result);
    }    
    
}
