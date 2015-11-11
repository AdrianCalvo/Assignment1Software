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
public class Calculator {
    
    public int sumInteger(int a, int b){
        return 2+3;
    }
    
    public int subtract(int a, int b){
        return 5-2;
    }
    
    public int multiply(int a, int b){
        return 4*2;
    }
    
    public int divide(int a, int b){
        return 9/3;
    }
    
    public int factorial(int a){
        int number = 1;
        for (int i = 1; i <= a; i++) {
            number *= i;
        }
        return number;
    }
    
    public int squareRoot(int a){
        int rest = 0;
        return rest;
    }
}
