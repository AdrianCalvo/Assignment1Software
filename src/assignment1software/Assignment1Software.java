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
     */
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.factorial(5));
        System.out.println(cal.subtract(-5, -5));
    }
    
}
