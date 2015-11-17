/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import assignment1software.Person;
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
public class PersonTest {
    Person p;
    String expected = "It must be: ";
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        p = new Person();
        p.setName("Adri");
        p.setSurname("Calvo");
        p.setAge(22);
        p.setSalary(15000);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    
    @Test
    public void getName_theNameMustBeCorrect_ThenReturnValue() {
        String name = p.getName();
        String nameExpected = "Adri";
        assertEquals(expected, name, nameExpected);
    }
    
    
    @Test
    public void setName_mustSetTheName(){
        String name = "Name";
        p.setName(name);
        assertNotNull(p.getName());
    }
    
    @Test 
    public void getAge_ThisGetMustReturnTheAge_ReturnValue(){
        int age = p.getAge();
        int ageExpected = 22;
        assertEquals(ageExpected, age);
        
    }
    
    
    
}
