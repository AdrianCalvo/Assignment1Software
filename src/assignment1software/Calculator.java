/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1software;

import static java.lang.Math.sqrt;

/**
 *
 * @author adri
 */
public class Calculator {
    
    public final int NUMBERZERO = 0;
    
    public int sumInteger(int a, int b){
        return a+b;
    }
    
    public int subtract(int a, int b){
        return a-b;
        
    }
    
    public int multiply(int a, int b){
        return a*b;
    }
    
    public int divide(int a, int b) throws Exception{
        if (a == NUMBERZERO || b == NUMBERZERO){
            return NUMBERZERO;
        }else
        return a/b;
    }
    
    public int factorial(int a){
        int number = 1;
        for (int i = 1; i <= a; i++) {
            number *= i;
        }
        return number;
    }
    
    public int squareRoot(int a){
        int rest = (int) sqrt(9);
        return rest;
    }
}
