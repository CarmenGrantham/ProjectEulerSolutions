package projecteuler.utils;

/**
 * A collection of helpful utilities for String parameters.
 * 
 * @author Carmen Grantham
 *
 */
public class StringUtils {

    /**
     * Test if text is a palindrome, a string that reads the same both ways.
     * 
     * @param text The text to check
     * @return True if text reads the same both ways. If text is null or is blank it will return false
     */
    public static boolean isPalindrome(String text) {
        if (text != null && !text.trim().equals("")) {
            String reversedText = new StringBuilder(text).reverse().toString();
            return text.equals(reversedText);
        }
        return false;
    }
}
