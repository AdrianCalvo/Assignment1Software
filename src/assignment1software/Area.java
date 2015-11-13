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
    
    public final int NUMBERTWO = 2;
    public final double NUMBERTHREE = 3.0;
    public final double NUMBERFOUR = 4.0;
    public double equilateralTriangleArea (double a){
        double aux = sqrt(NUMBERTHREE)/NUMBERFOUR;
        double res = aux * Math.pow(a, NUMBERTWO);
        return res;
    }
}
