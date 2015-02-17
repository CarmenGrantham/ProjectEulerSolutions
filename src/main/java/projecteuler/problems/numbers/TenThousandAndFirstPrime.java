package projecteuler.problems.numbers;

import projecteuler.utils.NumberUtils;

/**
 * Problem: By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *          What is the 10 001st prime number?
 * 
 * Notes. 
 *      Prime number: divided evenly only by 1 or itself. Must be whole number > 1 *          
 *          
 * @author Carmen Grantham
 *
 */
public class TenThousandAndFirstPrime {

    public static void main(String[] args) {
        TenThousandAndFirstPrime prime = new TenThousandAndFirstPrime();
        int number = 6;
        int result = prime.getPrimeNumberInSequence(number);
        System.out.printf("The prime number at %d is %d", number, result);
    }

    
    /**
     * Get the Xth prime number. 
     * ie 2 is first prime number, 13 is the sixth prime number
     * 
     * @param number the sequence number
     * @return Prime number at the supplied sequence number
     */
    public int getPrimeNumberInSequence(int number) {
        if (number <= 0) {
            return 0;
        }
        int latestPrimeNumber = -1;
        for (int i = 1; i <= number; i++) {
            latestPrimeNumber = getNextPrimeNumber(latestPrimeNumber);
        }
        return latestPrimeNumber;
    }
    
    
    /**
     * Get the prime number following the supplied int
     * 
     * @param afterNumber get prime number after this value
     * @return Prime number after the supplied int.
     */
    public int getNextPrimeNumber(int afterNumber) {
        afterNumber++;
        
        while(true) {
            if (NumberUtils.isPrimeNumber(afterNumber)) {
                return afterNumber;
            }
            afterNumber++;
        }
    }

}
