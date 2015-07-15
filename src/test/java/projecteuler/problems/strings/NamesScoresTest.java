package projecteuler.problems.strings;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test NamesScore class.
 * 
 * @author Carmen Grantham
 *
 */
public class NamesScoresTest {

    @Test
    public void getSumOfName_colin_returns53() {
        String filename = "p022_names_x3.txt";
        NamesScores scores = new NamesScores(filename);
        int sum = scores.getSumOfName("colin");
        assertEquals(53, sum);        
    }

    @Test
    public void getSumOfName_empty_returns0() {
        String filename = "p022_names_x3.txt";
        NamesScores scores = new NamesScores(filename);
        int sum = scores.getSumOfName("");
        assertEquals(0, sum);        
    }

    @Test
    public void getSumOfName_a_returns1() {
        String filename = "p022_names_x3.txt";
        NamesScores scores = new NamesScores(filename);
        int sum = scores.getSumOfName("a");
        assertEquals(1, sum);        
    }

    @Test
    public void getSumOfName_ab_returns3() {
        String filename = "p022_names_x3.txt";
        NamesScores scores = new NamesScores(filename);
        int sum = scores.getSumOfName("ab");
        assertEquals(3, sum);        
    }
    
    @Test
    public void getTotal_3names_returns385() {
        String filename = "p022_names_x3.txt";
        NamesScores scores = new NamesScores(filename);
        int result = scores.getTotal();
        assertEquals(385, result);
    }

    @Test
    public void getTotal_1name_returns53() {
        String filename = "p022_names_x1.txt";
        NamesScores scores = new NamesScores(filename);
        int result = scores.getTotal();
        assertEquals(53, result);
    }

    @Test
    public void getTotal_filenotfound_returns0() {
        String filename = "error.txt";
        NamesScores scores = new NamesScores(filename);
        int result = scores.getTotal();
        assertEquals(0, result);
    }

}
