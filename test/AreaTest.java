/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import assignment1software.Area;
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
public class AreaTest {
    
    public AreaTest() {
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
    
    public final double DELTA = 0.1;
    // I have used http://stackoverflow.com/questions/5686755/meaning-of-epsilon-argument-of-assertequals-for-double-values in order to know what a DELTA means.
    
    @Test
    public void EquilaterTriangleArea_AddOneNumberToCalculate_ReturnCorrectValue() {
        Area area = new Area();
        double are = area.equilateralTriangleArea(5);
        assertEquals(10.83, are, DELTA);
    }
    
    @Test (expected = ArithmeticException.class)
    public void EquilaterTriangleArea_TheNumberMustNotBeZero_ReturnException(){
        Area area = new Area ();
        double are = area.equilateralTriangleArea(0);
        fail("NumberMustNotBeZero");
    }
}
