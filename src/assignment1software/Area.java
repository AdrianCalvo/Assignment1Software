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
    
    public double equilateralTriangleArea (double a){
        double aux = sqrt(3)/4;
        double area = aux * a;
        return area;
    }
}
