/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import assignment1software.House;
import assignment1software.Person;
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
public class HouseTest {
    
    Person personWhoCanGetTheHouse;
    Person personWhoCannotGetTheHouse;
    House house;
    
    
    public HouseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        house = new House();
        personWhoCanGetTheHouse = mock(Person.class); // Object that simulates person
        personWhoCannotGetTheHouse = mock(Person.class);
        when(personWhoCannotGetTheHouse.isUpper18()).thenReturn(false);
        when(personWhoCannotGetTheHouse.salaryIsUpperThan12000()).thenReturn(false);
        when(personWhoCanGetTheHouse.isUpper18()).thenReturn(true);
        when(personWhoCanGetTheHouse.salaryIsUpperThan12000()).thenReturn(true);
        house.setAddress("Vaxjo Campus");
        house.setAvailability(10);
        house.setRent(3000);
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void setPerson_ifThePersonCanRentTheHouse_ThenReturnOk() throws Exception {
        house.setP(personWhoCanGetTheHouse);
    }
    
    @Test (expected =  UnsupportedOperationException.class)
    public void setPerson_thisPersonCannotGetTheHouse_ThenReturnException() throws Exception{
        house.setP(personWhoCannotGetTheHouse);
    }
}
