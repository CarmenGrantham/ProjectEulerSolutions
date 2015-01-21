package projecteuler.problems.numbers;

/**
 * Problem:
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
 * @author Carmen Grantham
 *
 */
public class SmallestMultiple {

    public static void main(String[] args) {
        SmallestMultiple sm = new SmallestMultiple();
        int result = sm.getDivisibleNumbersBetween(1,20);
        System.out.printf("The result is %d", result);
    }

    /**
     * Get the number that is divisible by value between start and end.
     * 
     * @param start
     * @param end
     * @return
     */
    public int getDivisibleNumbersBetween(int start, int end) {
        if (start > 0  && end > 0 && start < end) {
            int checkNumbers = end - start + 1;
            for (int i = end; ; i++) {
                int divisibleCount = 0;
                for (int j = start; j <=end; j++) {
                    if (i % j != 0) {
                        break;
                    } else {
                        divisibleCount++;
                    }
                }
                if (checkNumbers == divisibleCount) {
                    return i;
                }
            }
        }
        return -1;
    }
}
