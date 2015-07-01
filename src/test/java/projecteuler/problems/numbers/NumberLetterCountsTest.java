package projecteuler.problems.numbers;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test NumberLettersCounts
 * 
 * @author Carmen Grantham
 *
 */
public class NumberLetterCountsTest {

    @Test
    public void getCount_zero_returnsFour() {
        NumberLetterCounts counter = new NumberLetterCounts();
        int result = counter.getCountOfCharactersInSpeltOutNumber(0);
        assertEquals(4, result);
    }

    @Test
    public void getCount_one_returnsThree() {
        NumberLetterCounts counter = new NumberLetterCounts();
        int result = counter.getCountOfCharactersInSpeltOutNumber(1);
        assertEquals(3, result);
    }

    @Test
    public void getCount_minusOne_returnsEight() {
        // minus one (5 + 3)
        NumberLetterCounts counter = new NumberLetterCounts();
        int result = counter.getCountOfCharactersInSpeltOutNumber(-1);
        assertEquals(8, result);
    }    
    

    @Test
    public void getCount_oneThousandAndOne_returnsZero() {
        // one thousand and one (3 + 8 + 3 + 3) 
        NumberLetterCounts counter = new NumberLetterCounts();
        int result = counter.getCountOfCharactersInSpeltOutNumber(1001);
        assertEquals(0, result);
    }  

    @Test
    public void getCount_oneHundred_returns10() {
        // one hundred (3 + 7) 
        NumberLetterCounts counter = new NumberLetterCounts();
        int result = counter.getCountOfCharactersInSpeltOutNumber(100);
        assertEquals(10, result);
    }  
    


    @Test
    public void getCount_eighty_returns6() {
        // eighty (6)
        NumberLetterCounts counter = new NumberLetterCounts();
        int result = counter.getCountOfCharactersInSpeltOutNumber(80);
        assertEquals(6, result);
    }    
    
    @Test
    public void getCount_oneThousand_returnsEleven() {
        // one thousand (3 + 8)
        NumberLetterCounts counter = new NumberLetterCounts();
        int result = counter.getCountOfCharactersInSpeltOutNumber(1000);
        assertEquals(11, result);
    }    
    

    @Test
    public void getCount_923_returns25() {
        // nine hundred and twenty three (4 + 7 + 3 + 6 + 5)
        NumberLetterCounts counter = new NumberLetterCounts();
        int result = counter.getCountOfCharactersInSpeltOutNumber(923);
        assertEquals(25, result);
    }    

    @Test
    public void getCount_617_returns22() {
        // six hundred and seventeen (3 + 7 + 3 + 9)
        NumberLetterCounts counter = new NumberLetterCounts();
        int result = counter.getCountOfCharactersInSpeltOutNumber(617);
        assertEquals(22, result);
    }  
    
    @Test
    public void getCount_803_returns20() {
        // eight hundred and three (5 + 7 + 3 + 5)
        NumberLetterCounts counter = new NumberLetterCounts();
        int result = counter.getCountOfCharactersInSpeltOutNumber(803);
        assertEquals(20, result);
    }  
}
