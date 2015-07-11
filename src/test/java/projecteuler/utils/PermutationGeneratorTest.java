package projecteuler.utils;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

/**
 * Test PermutationGenerator
 * 
 * @author Carmen Grantham
 *
 */
public class PermutationGeneratorTest {

    @Test
    public void getPermutations_null_returns0() {
        PermutationGenerator generator = new PermutationGenerator(null);
        List<String> permutations = generator.getPermutations();
        assertEquals(0, permutations.size());
    }
        
    @Test
    public void getPermutations_blank_returns0() {
        PermutationGenerator generator = new PermutationGenerator("");
        List<String> permutations = generator.getPermutations();
        assertEquals(0, permutations.size());
    }

    @Test
    public void getPermutations_at_returns2() {
        PermutationGenerator generator = new PermutationGenerator("at");
        List<String> permutations = generator.getPermutations();
        assertEquals(2, permutations.size());
    }
    
    @Test
    public void getPermutations_dog_returns6() {
        PermutationGenerator generator = new PermutationGenerator("dog");
        List<String> permutations = generator.getPermutations();
        
        for (String s: permutations) {
            System.out.println(s);
        }
        assertEquals(6, permutations.size());
    }

    @Test
    public void getPermutations_cage_returns24() {
        PermutationGenerator generator = new PermutationGenerator("cage");
        List<String> permutations = generator.getPermutations();
        
        assertEquals(24, permutations.size());
    }

    @Test
    public void getPermutations_door_returns24() {
        PermutationGenerator generator = new PermutationGenerator("door");
        List<String> permutations = generator.getPermutations();
        
        assertEquals(24, permutations.size());
    }
    

    @Test
    public void getPermutations_123_returns6() {
        PermutationGenerator generator = new PermutationGenerator("123");
        List<String> permutations = generator.getPermutations();
        
        assertEquals(6, permutations.size());
    }
    

    @Test
    public void getPermutations_1122_returns24() {
        PermutationGenerator generator = new PermutationGenerator("1122");
        List<String> permutations = generator.getPermutations();
        
        assertEquals(24, permutations.size());
    }
    

    @Test
    public void getPermutations_1122_has1221() {
        PermutationGenerator generator = new PermutationGenerator("1122");
        List<String> permutations = generator.getPermutations();
        
        int indexOf = permutations.indexOf("1221");
        
        assertTrue(indexOf >= 0);
        
    }    
    
}
