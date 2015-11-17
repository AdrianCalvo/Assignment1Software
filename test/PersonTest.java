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
import static org.mockito.Mockito.mock;

/**
 *
 * @author adri
 */
public class PersonTest {
    public final double DELTA = 0.0001;
    Person p;
    Object o;
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
        p.setSalary(15000.0);
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
    public void getSurname_theSurnameMustBeCorrect_ThenReturnValue() {
        String surname = p.getSurname();
        String surnameExpected = "Calvo";
        assertEquals(expected, surname, surnameExpected);
    }
    
    @Test
    public void setName_mustSetTheName(){
        String name = "Name";
        p.setName(name);
        assertNotNull(p.getName());
    }
    
    @Test
    public void setSurname_mustSetTheSurname(){
        String surname = "Name";
        p.setSurname(surname);
        assertNotNull(p.getSurname());
    }
    
    @Test 
    public void getAge_ThisGetMustReturnTheAge_ReturnValue(){
        int age = p.getAge();
        int ageExpected = 22;
        assertEquals(ageExpected, age);
        
    }
    @Test
    public void setAge_mustSetTheAge(){
        int age = 18;
        p.setAge(age);
        assertNotNull(age);
    }
    
    @Test
    public void getSalary_mustHaveSalary_ReturnSalary(){
        double salary = p.getSalary();
        double salayExpected = 15000;
        assertEquals(salayExpected, salary, DELTA);
    }
    
    @Test
    public void toString_mustReturnPersonsValues_ReturnValues(){
        String toString;
        String toStringExpected = "Adri" + "Calvo" + 22 + 15000.0;
        String name = p.getName();
        String surname = p.getSurname();
        int age = p.getAge();
        double salary = p.getSalary();
        toString = name + surname + age + salary;
        assertEquals(toStringExpected, toString);
    }
    
    @Test
    public void isUpper18_TheUserIsUpper18_ThenReturnTrue(){
        p.setAge(18);
        boolean ageUpper18;
        assertTrue(p.isUpper18());
    }
}
