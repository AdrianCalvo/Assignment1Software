/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1software;

/**
 *
 * @author adri
 */
public class Assignment1Software {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        // main is here to check. There is not a real program
        // It has been created to use TDD and Mocks
        Person p = new Person();
        House h = new House();
        p.setName("Adrián");
        p.setSurname("Calvo");
        p.setSalary(12000);
        p.setAge(18);
        h.setP(p);
        System.out.println(h.getP());
    }
    
}
