package projecteuler.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import projecteuler.utils.PermutationGenerator.PermutationOption;

public class PermutationGeneratorBasic {
private List<String> permutations;
    
    /**
     * Create list of all permutations of given value
     * 
     * @param value The value to permute
     */
    public PermutationGeneratorBasic(String value) {
        permutations = new ArrayList<String>();
        
        if (value != null) {
            int valueLength = value.length();
            if (valueLength > 0) {
                boolean[] used = new boolean[valueLength];
                char[] valueArray = value.toCharArray();
                StringBuilder output = new StringBuilder();
                int level = 0;
                
                doPermutations(valueArray, output, used, valueLength, level);
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
    private void doPermutations(char[] value, StringBuilder output, boolean[] used, int valueLength, int level) {
        if (level == valueLength) {
            add(output.toString());
            return;
        }
        
        IntStream.range(0, valueLength)
            .filter(i -> !used[i])
            .forEach(i -> processPermutation(value, output, used, valueLength, level, i));
    }
    
    /**
     * Process the permutation.
     * @param option The PermutationOption to process
     * @param index The character position to process
     */
    private void processPermutation(char[] value, StringBuilder output, boolean[] used, int valueLength, int level, int index) {
        output.append(value[index]);
        used[index] = true;
        
        doPermutations(value, output, used, valueLength, level + 1);
        used[index] = false;
        
        output.setLength(output.length() - 1);
    }
}
