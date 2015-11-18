/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import assignment1software.InputOutput;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import static java.lang.System.console;
import static jdk.nashorn.tools.ShellFunctions.input;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author adri
 */
public class InputOutputTest {
    
    public InputOutputTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception{
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testReadString() {
        InputOutput io = mock(InputOutput.class);
        BufferedReader keyboard = mock(BufferedReader.class);
        String example = "Example";
        when(io.readString()).thenReturn(example);
    }
    
    @Test
    public void testReadIntWithCorrectValue() {
        InputOutput io = mock(InputOutput.class);
        BufferedReader keyboard = mock(BufferedReader.class);
        int example = 2;
        when(io.readInt()).thenReturn(example);
    }
    
    @Test
    public void testReadIntWhitIncorrectValue() throws Exception {
        InputOutput io = mock(InputOutput.class);
        BufferedReader keyboard = mock(BufferedReader.class);
        String incorrect = "a";
        when(io.readInt()).thenThrow(java.lang.Exception.class);
    }
}
