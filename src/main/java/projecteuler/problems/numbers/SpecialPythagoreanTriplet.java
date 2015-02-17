package projecteuler.problems.numbers;

import projecteuler.utils.NumberCalculator;

/**
 * Problem: A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *      a2 + b2 = c2
 *
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 52.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 * Notes. Product is the multiplication of one or more numbers.
 *
 * @author Carmen Grantham
 *
 */
public class SpecialPythagoreanTriplet {

    private static final int DEFAULT_A = 1;
    private static final int DEFAULT_B = DEFAULT_A + 1;
    private static final int DEFAULT_C = DEFAULT_B + 1;
    
    
    private int a = DEFAULT_A;
    private int b = DEFAULT_B;
    private int c = DEFAULT_C;
    

    public static void main(String[] args) {
        SpecialPythagoreanTriplet triplet = new SpecialPythagoreanTriplet();
        int result = triplet.getProductWithExpectedSum(1000);
        System.out.printf("The product for pythagorean triplet of 1000 is %d", result);
    }
    
    /**
     * Get the product of the pythagorean triplet numbers that when added together equal expectedTotalSum
     * 
     * @param expectedTotalSum The expected total when the pythagorean triplet numbers are added together
     * @return The product of the pythagorean triplet numbers, if expectedTotalSum is 0 or less return 0.
     */
    public int getProductWithExpectedSum(int expectedTotalSum) {
        if (expectedTotalSum <= 0) {
            return 0;
        }

        while (true) {
            if (isPythagoreanTriplet(a, b, c)) {
                int totalSum = NumberCalculator.getSum(a, b, c);
                if (totalSum == expectedTotalSum) {
                    int totalProduct = NumberCalculator.getProduct(a, b, c);
                    return totalProduct;
                }
            }
            incrementNumbers();
        }
    }
    
    /**
     * Increment numbers a, b and c, so that all possible combinations are eventually tried.
     */
    private void incrementNumbers() {
        if ((a+1) >= b) {
            if ((b+1) >= c) {
                // Increment c by 1, and reset a and b
                c += 1;
                b = DEFAULT_B;
                a = DEFAULT_A;
            } else {
                // Increment b by 1 and reset a
                b += 1;
                a = DEFAULT_A;
            }
        } else {
            a += 1;
        }
    }
    
    
    /**
     * Check if the supplied values are a pythagorean triplet number ie a^2 + b^2 = c^2
     * 
     * @param a
     * @param b
     * @param c
     * @return True when it's a pythagorean triplet number
     */
    private boolean isPythagoreanTriplet(int a, int b, int c) {
        if (a < b && b < c) {
            
            int aSquared = (a*a);
            int bSquared = (b*b);
            int cSquared = (c*c);
            
            int aPlusBSquared = aSquared + bSquared;
            
            return aPlusBSquared == cSquared;
        }
        return false;
    }    
    
}
