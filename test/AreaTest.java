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
import sun.misc.JavaLangAccess;

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
    public final int NUMBERZERO = 0;
    public final int NUMBERFIVE = 5;
    public final int NUMBERTHREE = 3;
    // I have used http://stackoverflow.com/questions/5686755/meaning-of-epsilon-argument-of-assertequals-for-double-values in order to know what a DELTA means.
    
    @Test
    public void EquilaterTriangleArea_AddOneNumberToCalculate_ReturnCorrectValue() {
        Area area = new Area();
        double are = area.equilateralTriangleArea(NUMBERFIVE);
        assertEquals(10.83, are, DELTA);
    }
    
    @Test (expected = java.lang.AssertionError.class)
    public void equilaterTriangleArea_TheNumberMustNotBeZero_ReturnException(){
        Area area = new Area ();
        double are = area.equilateralTriangleArea(NUMBERZERO);
        fail("An area cannot have any 0");
    }
    
    
    @Test 
    public void triangleArea_AddTwoCorrectValue_ReturnCorrectValue(){
        Area area = new Area();
        double are = area.triangleArea(NUMBERFIVE, NUMBERTHREE);
        assertEquals(7.5, are, DELTA);
    }
    
    @Test (expected = java.lang.AssertionError.class)
    public void triangleArea_AnyNumberMustNotBeZero_ReturnException(){
        Area area = new Area();
        double are = area.triangleArea(0, 5);
        fail();
    }
     @Test (expected = java.lang.AssertionError.class)
    public void triangleArea_AnyNumberMustNotBeZeroB_ReturnException(){
        Area area = new Area();
        double are = area.triangleArea(5, 0);
        fail();
    }
    
    @Test (expected = java.lang.AssertionError.class)
    public void triangleArea_NumbersMustNotBeNegativeA_ReturnException(){
//        Area are = new Area();
//        double res = are.triangleArea(-5, 2);
//        fail();
    }
}
