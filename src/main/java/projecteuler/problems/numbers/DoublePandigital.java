package projecteuler.problems.numbers;

import projecteuler.utils.PermutationGeneratorBasic;

/**
 * Problem 491: Double pandigital number divisible by 11
 * 
 * We call a positive integer double pandigital if it uses all the 
 * digits 0 to 9 exactly twice (with no leading zero). For example, 
 * 40561817703823564929 is one such number.
 * 
 * How many double pandigital numbers are divisible by 11?
 * 
 * @author Carmen Grantham
 *
 */
public class DoublePandigital extends PermutationGeneratorBasic {

    private static final String DOUBLE_PANDIGITAL_NUMBER = "01234567890123456789";
    private static final int DIVISOR = 11;
    
    public static void main(String[] args) {
        DoublePandigital calculator = new DoublePandigital();
        long count = calculator.getNumberOfPermutations();
        System.out.printf("The number of double pandigital numbers divisible by %d is %d", DIVISOR, count);
    }
    
    public DoublePandigital() {
        super(DOUBLE_PANDIGITAL_NUMBER);
    }
    
    public DoublePandigital(String value) {
        super(value);
    }
    
    @Override
    public void add(String value) {
        try {
            long number = Long.parseLong(value);
            
            // Exclude values that start with 0
            if (!value.startsWith("0")) {
                // Only add number if it's divisible by DIVISOR
                if (number % DIVISOR == 0) {
                    super.add(value);
                }
            }
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
    
    public int getNumberOfPermutations() {
        return getPermutations().size();
    }
}
