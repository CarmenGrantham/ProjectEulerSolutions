package projecteuler.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Generate a list of permutations from a given string.
 * 
 * So dog will return:
 * dog
 * dgo
 * odg
 * ogd
 * gdo
 * god 
 * 
 * Based on code found at http://www.programmerinterview.com/index.php/recursion/permutations-of-a-string/
 * 
 * @author Carmen Grantham
 *
 */
public class PermutationGenerator {

    private List<String> permutations;
    
    /**
     * Create list of all permutations of given value
     * 
     * @param value The value to permute
     */
    public PermutationGenerator(String value) {
        permutations = new ArrayList<String>();
        
        if (value != null) {
            int valueLength = value.length();
            if (valueLength > 0) {
                PermutationOption option = new PermutationOption(value);
                doPermutations(option);
            }
        }
    }
    
    /**
     * Get the list of permutations.
     * 
     * @return list of permutations
     */
    public List<String> getPermutations() {
        return permutations;        
    }
    
    /**
     * Add the permutation to the list.
     * Declaring it as a method enables it to be overridden by classes
     * that may want slightly different action.
     * 
     * @param value The value to add to the permutation list.
     */
    public void add(String value) {
        permutations.add(value);
    }

    /**
     * Perform the permutation on the given PermutationOption.
     * 
     * @param option The PermutationOption to process
     */
    private void doPermutations(PermutationOption option) {
        if (option.isLastLevel()) {
            add(option.getOutput());
            return;
        }
        
        IntStream.range(0, option.getLength())
            .filter(i -> option.isNotUsed(i))
            .forEach(i -> processPermutation(option, i));
    }
    
    /**
     * Process the permutation.
     * @param option The PermutationOption to process
     * @param index The character position to process
     */
    private void processPermutation(PermutationOption option, int index) {
        option.addElementAt(index);
        option.setUsed(index, true);
        
        PermutationOption copyOption = new PermutationOption(option);
        copyOption.incrementLevel(1);
        doPermutations(copyOption);
        
        option.setUsed(index, false);
        option.decrementOutputLength(1);
        
        Runtime.getRuntime().gc();
    }
    
    /**
     * A class that stores all the details of each recursion of a permutation.
     * @author Carmen Grantham
     *
     */
    class PermutationOption {
        StringBuilder output = new StringBuilder();
        char[] valueArray;
        int level = 0;
        int length;
        boolean[] used;
        
        public PermutationOption(String value) {
            valueArray = value.toCharArray();
            length = value.length();
            used = new boolean[length];
        }
        
        public PermutationOption(PermutationOption option) {
            this(option.getValue());
            this.level = option.level;
            this.used = option.used;
            this.output = option.output;
        }
        
        public String getOutput() {
            return output.toString();
        }
        
        public boolean isLastLevel() {
            return level == getLength();
        }
        
        public int getLength() {
            return length;
        }
        
        public void decrementOutputLength(int amount) {
            this.output.setLength(output.length() - amount);
        }
        
        public int getLevel() {
            return level;
        }
        
        public void incrementLevel(int amount) {
            this.level += amount;
        }
        
        public String getValue() {
            return new String(valueArray);
        }
        
        public boolean[] getUsed() {
            return used;
        }
        
        public boolean isUsed(int index) {
            return used[index];
        }
        
        public boolean isNotUsed(int index) {
            return !isUsed(index);
        }
        
        public void setUsed(int index, boolean status) {
            used[index] = status;
        }
        
        public void addElementAt(int index) {
            output.append(valueArray[index]);
        }
    }
}
