package projecteuler.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class PermutationGeneratorBasicTest {
    @Test
    public void getPermutations_null_returns0() {
        PermutationGeneratorBasic generator = new PermutationGeneratorBasic(null);
        List<String> permutations = generator.getPermutations();
        assertEquals(0, permutations.size());
    }
        
    @Test
    public void getPermutations_blank_returns0() {
        PermutationGeneratorBasic generator = new PermutationGeneratorBasic("");
        List<String> permutations = generator.getPermutations();
        assertEquals(0, permutations.size());
    }

    @Test
    public void getPermutations_at_returns2() {
        PermutationGeneratorBasic generator = new PermutationGeneratorBasic("at");
        List<String> permutations = generator.getPermutations();
        assertEquals(2, permutations.size());
    }
    
    @Test
    public void getPermutations_dog_returns6() {
        PermutationGeneratorBasic generator = new PermutationGeneratorBasic("dog");
        List<String> permutations = generator.getPermutations();
        
        for (String s: permutations) {
            System.out.println(s);
        }
        assertEquals(6, permutations.size());
    }

    @Test
    public void getPermutations_cage_returns24() {
        PermutationGeneratorBasic generator = new PermutationGeneratorBasic("cage");
        List<String> permutations = generator.getPermutations();
        
        assertEquals(24, permutations.size());
    }

    @Test
    public void getPermutations_door_returns24() {
        PermutationGeneratorBasic generator = new PermutationGeneratorBasic("door");
        List<String> permutations = generator.getPermutations();
        
        assertEquals(24, permutations.size());
    }
    

    @Test
    public void getPermutations_123_returns6() {
        PermutationGeneratorBasic generator = new PermutationGeneratorBasic("123");
        List<String> permutations = generator.getPermutations();
        
        assertEquals(6, permutations.size());
    }
    

    @Test
    public void getPermutations_1122_returns24() {
        PermutationGeneratorBasic generator = new PermutationGeneratorBasic("1122");
        List<String> permutations = generator.getPermutations();
        
        assertEquals(24, permutations.size());
    }
    

    @Test
    public void getPermutations_1122_has1221() {
        PermutationGeneratorBasic generator = new PermutationGeneratorBasic("1122");
        List<String> permutations = generator.getPermutations();
        
        int indexOf = permutations.indexOf("1221");
        
        assertTrue(indexOf >= 0);
        
    }    
    


}
