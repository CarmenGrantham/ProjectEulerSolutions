package projecteuler.problems.numbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoublePandigitalTest {

    @Test
    public void getNumberOfPermutations_132_returns2() {
        DoublePandigital calculator = new DoublePandigital("132");
        int count = calculator.getNumberOfPermutations();
        // 132 and 231 are divisible by 11
        assertEquals(2, count);        
    }
    
    @Test
    public void getNumberOfPermutations_122_returns0() {
        DoublePandigital calculator = new DoublePandigital("122");
        int count = calculator.getNumberOfPermutations();
        assertEquals(0, count);        
    }
    

    @Test
    public void getNumberOfPermutations_0132_returns6() {
        DoublePandigital calculator = new DoublePandigital("0132");
        int count = calculator.getNumberOfPermutations();
        assertEquals(6, count);        
    }
    


    @Test
    public void getNumberOfPermutations_null_returns0() {
        DoublePandigital calculator = new DoublePandigital(null);
        int count = calculator.getNumberOfPermutations();
        assertEquals(0, count);        
    }
    

    @Test
    public void getNumberOfPermutations_blank_returns0() {
        DoublePandigital calculator = new DoublePandigital("");
        int count = calculator.getNumberOfPermutations();
        assertEquals(0, count);        
    }

    @Test
    public void getNumberOfPermutations_0_returns0() {
        DoublePandigital calculator = new DoublePandigital("0");
        int count = calculator.getNumberOfPermutations();
        assertEquals(0, count);        
    }
    

    @Test
    public void getNumberOfPermutations_abc_returns0() {
        DoublePandigital calculator = new DoublePandigital("abc");
        int count = calculator.getNumberOfPermutations();
        assertEquals(0, count);        
    }
    
}
