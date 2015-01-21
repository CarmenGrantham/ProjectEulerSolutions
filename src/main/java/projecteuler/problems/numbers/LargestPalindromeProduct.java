package projecteuler.problems.numbers;

import projecteuler.utils.StringUtils;

/**
 * Problem:
 * 
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * @author Carmen Grantham
 *
 */
public class LargestPalindromeProduct {

    public static void main(String[] args) {
        LargestPalindromeProduct product = new LargestPalindromeProduct();
        int result = product.getLargest(3);
        System.out.printf("Result is %d", result);
    }
    

    /**
     * Get the largest palindrome from the product of two numbers that have the specified number of digits.
     * ie if digits is 2 then it will use all values between 10 and 99
     * 
     * @param digits The number of digits in the numbers to be multipled
     * @return The largest palindrome number created by multiplying two numbers together with the specified number of digits.
     */
    public int getLargest(int digits) {
        if (digits > 0) {
            int startNumber = getStartingNumber(digits);
            int endNumber = getStartingNumber(digits + 1) - 1;
            int largestPalindrome = 0;
            
            for (int x = endNumber; x >= startNumber; x--) {
                for (int y = endNumber; y >= startNumber; y--) {
                    int sum = x * y;
                    if (StringUtils.isPalindrome(sum + "")) {
                        if (sum > largestPalindrome) {
                            largestPalindrome = sum;
                        }
                    }
                }
            }
            return largestPalindrome;
        }
        return -1;
    }
    
    
    /**
     * Get the first number with the number of specified digits.
     * ie. if digits is 2 return 10
     * 
     * @param digits Used to calculate starting number
     * @return The first number that has the specified number of digits.
     */
    public int getStartingNumber(int digits) {
        if (digits > 0) {
            int start = 1;
            for (int i = 2; i <= digits; i++) {
                start = start * 10;
            }
            return start;
        }
        return -1;
    }
}
