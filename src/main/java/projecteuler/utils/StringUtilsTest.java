package projecteuler.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test StringUtils
 * 
 * @author Carmen Grantham
 *
 */
public class StringUtilsTest {

    @Test
    public void isPalindrome_null_returnsFalse() {
        boolean result = StringUtils.isPalindrome(null);
        assertFalse(result);
    }

    @Test
    public void isPalindrome_emptyString_returnsFalse() {
        boolean result = StringUtils.isPalindrome("  ");
        assertFalse(result);
    }

    @Test
    public void isPalindrome_abc_returnsFalse() {
        boolean result = StringUtils.isPalindrome("abc");
        assertFalse(result);
    }


    @Test
    public void isPalindrome_glenelg_returnsTrue() {
        boolean result = StringUtils.isPalindrome("glenelg");
        assertTrue(result);
    }
    

    @Test
    public void isPalindrome_glenelgWithSpaces_returnsFalse() {
        boolean result = StringUtils.isPalindrome("glenelg ");
        assertFalse(result);
    }
}
