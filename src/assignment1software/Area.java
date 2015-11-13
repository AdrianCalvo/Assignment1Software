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
public class Area {
    
    public final int NUMBERZERO = 0;
    public final int NUMBERTWO = 2;
    public final int NUMBERTHREE = 3;
    public final int NUMBERFOUR = 4;
    public double equilateralTriangleArea (double a){
        double aux = sqrt(NUMBERTHREE)/NUMBERFOUR;
        if (a == NUMBERZERO){
            return NUMBERZERO;
        }else {
           double res = aux * Math.pow(a, NUMBERTWO);
           return res; 
        }
    }
    
    public double triangleArea(double base, double height){
        double res = base*height/2;
        return res;
    }
    
    
    
}
