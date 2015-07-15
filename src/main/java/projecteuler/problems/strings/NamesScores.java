package projecteuler.problems.strings;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import com.opencsv.CSVReader;

/**
 * Problem 22: Using names.txt (right click and 'Save Link/Target As...'), a 46K 
 * text file containing over five-thousand first names, begin by sorting it into 
 * alphabetical order. Then working out the alphabetical value for each name, 
 * multiply this value by its alphabetical position in the list to obtain a name score.
 * 
 * For example, when the list is sorted into alphabetical order, COLIN, which is 
 * worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would 
 * obtain a score of 938 × 53 = 49714.
 * 
 * What is the total of all the name scores in the file?
 * 
 * 
 * @author Carmen Grantham
 *
 */
public class NamesScores {

    private List<String> names;
    
    public static void main(String[] args) {
        String filename = "p022_names.txt";
        NamesScores scores = new NamesScores(filename);
        int result = scores.getTotal();
        System.out.printf("The total value for names in file is %d", result);
    }
    
    /**
     * Create a class that uses the given filename to get access to names.
     * 
     * @param filename The filename to use
     */
    public NamesScores(String filename) {
        loadNames(filename);
        sortNames();
    }
    
    /**
     * Load the names from the given filename.
     * 
     * @param filename The filename to use.
     */
    public void loadNames(String filename) {
        
        CSVReader reader = null;
        try {
            InputStream in = getClass().getClassLoader().getResourceAsStream(filename);
            reader = new CSVReader(new InputStreamReader(in));
            
            String [] nextLine;
            
            names = new ArrayList<String>();
            
            //Read one line at a time
            while ((nextLine = reader.readNext()) != null) {
                for(String token : nextLine) {
                    names.add(token);
                }
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     * Sort names into alphabetical order.
     */
    public void sortNames() {
        if (names != null) {
            Collections.sort(names);
        }
    }
    
    /**
     * Get the total value of each name multiplied by their position in the list.
     * @return Total of all names
     */
    public int getTotal() {
        if (names == null) {
            return 0;
        }
        int total = IntStream.range(0, names.size())
                .map( i -> getSumOfName(names.get(i)) * (i + 1))
                .sum();
        return total;
    }
    
    /**
     * Get the total value for the given name, where 'a' is assigned to 1, 'b'
     * is assigned to 2 and so on. 
     * 
     * @param name The name to use
     * @return The total value for the given name
     */
    public int getSumOfName(String name) {
        name = name.toLowerCase();
        
        char[] characters = name.toCharArray();
        
        int total = IntStream.range(0, characters.length)
                .map(i -> characters[i] - 'a' + 1)
                .sum();
        return total;
    }
    
    
}
