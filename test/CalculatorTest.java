/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import assignment1software.Calculator;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adri
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void sumInteger_SumTwoIntegers_ReturnValueEqual5() {
        Calculator cal = new Calculator();
        int result = cal.sumInteger(2, 3);
        assertEquals(5, result);
    }
    
    @Test
    public void subtractInteger_SubtractTwoIntegers_ReturnValueEquals3(){
        Calculator cal = new Calculator();
        int result = cal.subtract(5, 2);
        assertEquals(3, result);
    }
    
      @Test
    public void multiplyInteger_MultiplyTwoIntegers_ReturnValueEquals8(){
        Calculator cal = new Calculator();
        int result = cal.multiply(4, 2);
        assertEquals(8, result);
    }
    
       @Test
    public void divideInteger_DivideTwoIntegers_ReturnValueEquals3(){
        Calculator cal = new Calculator();
        int result = cal.divide(9, 3);
        assertEquals(3, result);
    }
    
    @Test
    public void factorial_ValueOfFactorial_ReturnFactorialOf5(){
        Calculator cal = new Calculator();
        int result = cal.factorial(5);
        assertEquals(120, result);
    }
}
