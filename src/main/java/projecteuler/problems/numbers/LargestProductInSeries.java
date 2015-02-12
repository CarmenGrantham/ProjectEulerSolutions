package projecteuler.problems.numbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: The four adjacent digits in the 1000-digit number that have the greatest product are 9 x 9 x 8 x 9 = 5832.
 *      73167176531330624919225119674426574742355349194934
 *      96983520312774506326239578318016984801869478851843
 *      85861560789112949495459501737958331952853208805511
 *      12540698747158523863050715693290963295227443043557
 *      66896648950445244523161731856403098711121722383113
 *      62229893423380308135336276614282806444486645238749
 *      30358907296290491560440772390713810515859307960866
 *      70172427121883998797908792274921901699720888093776
 *      65727333001053367881220235421809751254540594752243
 *      52584907711670556013604839586446706324415722155397
 *      53697817977846174064955149290862569321978468622482
 *      83972241375657056057490261407972968652414535100474
 *      82166370484403199890008895243450658541227588666881
 *      16427171479924442928230863465674813919123162824586
 *      17866458359124566529476545682848912883142607690042
 *      24219022671055626321111109370544217506941658960408
 *      07198403850962455444362981230987879927244284909188
 *      84580156166097919133875499200524063689912560717606
 *      05886116467109405077541002256983155200055935729725
 *      71636269561882670428252483600823257530420752963450
 *
 * Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
 * 
 * @author Carmen Grantham
 *
 */
public class LargestProductInSeries {

    public static final String BIG_NUMBER = "73167176531330624919225119674426574742355349194934"
            + "96983520312774506326239578318016984801869478851843"
            + "85861560789112949495459501737958331952853208805511"
            + "12540698747158523863050715693290963295227443043557"
            + "66896648950445244523161731856403098711121722383113"
            + "62229893423380308135336276614282806444486645238749"
            + "30358907296290491560440772390713810515859307960866"
            + "70172427121883998797908792274921901699720888093776"
            + "65727333001053367881220235421809751254540594752243"
            + "52584907711670556013604839586446706324415722155397"
            + "53697817977846174064955149290862569321978468622482"
            + "83972241375657056057490261407972968652414535100474"
            + "82166370484403199890008895243450658541227588666881"
            + "16427171479924442928230863465674813919123162824586"
            + "17866458359124566529476545682848912883142607690042"
            + "24219022671055626321111109370544217506941658960408"
            + "07198403850962455444362981230987879927244284909188"
            + "84580156166097919133875499200524063689912560717606"
            + "05886116467109405077541002256983155200055935729725"
            + "71636269561882670428252483600823257530420752963450";
    
    public static void main(String[] args) {
        LargestProductInSeries calculator = new LargestProductInSeries();
        int digits = 13;
        long result = calculator.getGreatestProduct(digits);
        System.out.printf("The largest product is %d", result);
    }
    
    
    /**
     * Find the largest product with adjacent digits within BIG_NUMBER.
     * 
     * @param digits The number of adjacent digits to use
     * @return The largest product
     */
    public long getGreatestProduct(int digits) {
        if (digits <= 0) {
            return 0;
        }
        if (digits == 1) {
            return getLargestNumber();
        }
        
        List<String> numberOptions = getNumberOptions(digits);
        long largest = 0;
        for (String option : numberOptions) {
            long total = getProduct(option);
            System.out.print(option + " = " + total);
            if (total > largest) {
                largest = total;
                System.out.print(" - NEW LARGEST");
            }
            System.out.println("");
        }
        
        return largest;
    }
    
    
    /**
     * Get a list of all the possible numbers within BIG_NUMBER with the number of adjacent digits.
     * 
     * @param digits The number of digits to use
     * @return List of all possible numbers
     */
    private List<String> getNumberOptions(int digits) {
        List<String> options = new ArrayList<String>();
        for (int i = 0; i < BIG_NUMBER.length() - digits + 1; i++) {
            String numbers = BIG_NUMBER.substring(i, i + digits);
            options.add(numbers);
        }
        return options;        
    }
    
    
    /**
     * Given a string value turn each character into a number and multiple them together.
     * 
     * @param value The string value to use
     * @return The total of each digit multiplied together.
     */
    private long getProduct(String value) {
        long total = Integer.parseInt(value.substring(0, 1));
        for (int i = 1; i < value.length(); i++) {
            int number = Integer.parseInt(value.substring(i, i + 1));
            total = total * number;
        }
        return total;
    }
    
    
    /**
     * Get the largest digit from BIG_NUMBER
     * @return Largest digit. Value between 0 and 9
     */    
    private int getLargestNumber() {
        // Set largest to the first value in the string
        int largest = Integer.parseInt(BIG_NUMBER.substring(0,1));
        
        // Find a larger value now
        for (int i = 1; i < BIG_NUMBER.length(); i++) {
            int number = Integer.parseInt(BIG_NUMBER.substring(i,i+1));
            if (number > largest) {
                largest = number;
            }
            
            // Largest possible value is 9 so break loop and return 9
            if (largest == 9) {
                break;
            }
        }
        return largest;
    }

}
