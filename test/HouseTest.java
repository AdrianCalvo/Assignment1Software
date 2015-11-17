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
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author adri
 */
public class HouseTest {
    
    Person personWhoCanGetTheHouse;
    Person personWhoCannotGetTheHouse;
    House house;
    
    public final double DELTA = 0.0001;
    
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
        house.setAvailabilityInMonths(10);
        house.setRent(3000);
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    @Test
    public void setPerson_ifThePersonCanRentTheHouse_ThenVerify() throws Exception {
        personWhoCanGetTheHouse.setAge(18);
        personWhoCanGetTheHouse.setSalary(12000);
        
        house.setP(personWhoCanGetTheHouse);
        when(personWhoCanGetTheHouse.isUpper18()).thenReturn(true);
        when(personWhoCanGetTheHouse.salaryIsUpperThan12000()).thenReturn(true);
        
        // verify if isUpper18 has been called.
        verify(personWhoCanGetTheHouse).isUpper18();
        // verify if salaryIsUpperThan12000 has been called.
        verify(personWhoCanGetTheHouse).salaryIsUpperThan12000();
        
        
    }
    
    @Test (expected =  java.lang.Exception.class)
    public void setPerson_thisPersonCannotGetTheHouse_ThenReturnException() throws Exception{
        personWhoCannotGetTheHouse.setAge(17);
        personWhoCannotGetTheHouse.setSalary(11000);
                
        house.setP(personWhoCannotGetTheHouse);
        
        when(personWhoCannotGetTheHouse.isUpper18()).thenReturn(false);
        when(personWhoCannotGetTheHouse.salaryIsUpperThan12000()).thenReturn(false);
        
        verify(personWhoCannotGetTheHouse).isUpper18();
        verify(personWhoCannotGetTheHouse).salaryIsUpperThan12000();
    }
    
    @Test (expected =  java.lang.Exception.class)
    public void setPerson_thisPersonCannotGetTheHouseFailsOneValue_ThenReturnException() throws Exception{
        personWhoCannotGetTheHouse.setAge(17);
        personWhoCannotGetTheHouse.setSalary(13000);
                
        house.setP(personWhoCannotGetTheHouse);
        
        when(personWhoCannotGetTheHouse.isUpper18()).thenReturn(false);
        when(personWhoCannotGetTheHouse.salaryIsUpperThan12000()).thenReturn(true);
        
        verify(personWhoCannotGetTheHouse).isUpper18();
        verify(personWhoCannotGetTheHouse).salaryIsUpperThan12000();
    }
    
    @Test
    public void getAvailailityInMonths_MustReturnAValue_ReturnValue(){
        int availa = house.getAvailabilityInMonths();
        int availaExpected = 10;
        assertEquals(availaExpected, availa);
    }
    
    @Test
    public void getRent_MustReturnAValue_ReturnValue(){
        double rent = house.getRent();
        double rentExpected = 3000;
        assertEquals(rentExpected, rent, DELTA);
    }
}
