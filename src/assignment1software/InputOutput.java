/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1software;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author adri
 */
public class InputOutput {

    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    public String readString() {
        String a = null;
        try {
            a = keyboard.readLine();
        } catch (Exception e) {
            System.out.println("There has been an error: " + e.getMessage());
        }

        return a;
    }

    public double readDouble() {
        double d = 0;
        String aux;
        boolean ok = false;
        do {
            try {
                aux = keyboard.readLine();
                d = Double.valueOf(aux);
                ok = true;
            } catch (IOException | NumberFormatException e) { // Esa excepción la ha hecho NetBeans solo
                System.out.println("There has been an error: " + e.getMessage());

            }
        } while (ok == false);

        return d;
    }

    public int readInt() {
        int z = 0;
        String aux;
        boolean ok = false;
        do {
            try {
                aux = keyboard.readLine();
                z = Integer.valueOf(aux);
                ok = true;
            } catch (IOException | NumberFormatException e) { // Esa excepción la ha hecho NetBeans solo
                System.out.println("There has been an error: " + e.getMessage());

            }

        } while (ok == false);

        return z;
    }

}
