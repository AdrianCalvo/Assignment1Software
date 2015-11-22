/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1software;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.time.Clock.system;

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
        // main cannot be tested.
        int option = 0;
        String aux;
        boolean ok = true;
        int a = 0;
        int b = 0;
        double h = 0;
        double base = 0;
        double height = 0;
        Person per = new Person();
        Calculator cal = new Calculator();
        House house = new House();
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose an option 1. Calculator, 2. Area, 3. Person, 4. House");
        do {
            option = readInt();
        } while (ok == false || (option >= 5 || option <= 0));

        switch (option) {
            case 1:
                System.out.println("What do you want to watch?");
                System.out.print("1. add, 2. substract, 3. divide");
                System.out.println(" 4. multiply, 5. factor, 6. square root");

                option = readInt();
                
                switch (option) {

                    case 1:
                        System.out.println("Choose 2 numbers");
                        a = readInt();
                        b = readInt();
                        System.out.println(cal.sumInteger(a, b));
                        break;
                    case 2:
                        System.out.println("Choose 2 numbers");
                        a = readInt();
                        b = readInt();
                        System.out.println(cal.subtract(a, b));
                        break;
                    case 3:
                        System.out.println("Choose 2 numbers");
                        a = readInt();
                        b = readInt();
                        if (a <= 0 || b <= 0) {
                            System.out.println("Error");
                        } else {
                            System.out.println(cal.divide(a, b));
                        }
                        break;
                    case 4:
                        System.out.println("Choose 2 numbers");
                        a = readInt();
                        b = readInt();
                        if (a < 0) {
                            System.out.println("Error");
                        } else {
                            System.out.println(cal.multiply(a, b));
                        }
                        break;
                    case 5:
                        System.out.println("Choose a number");
                        a = readInt();
                        if (a < 0) {
                            System.out.println("error");
                        } else {
                            System.out.println(cal.factorial(a));
                        }
                        break;
                    case 6:
                        System.out.println("Choose a number");
                        a = readInt();
                        if (a < 0) {
                            System.out.println("Error");
                        } else {
                            System.out.println(cal.squareRoot(a));
                        }
                        break;
                    default:
                        System.out.println("This number is invalid");
                }
                break;
            case 2:
                Area area = new Area();
                System.out.println("What do you want to watch?");
                System.out.println("1. Equilateral Traingle, 2. Regular Triangle");
                option = readInt();
                switch (option) {
                    case 1:
                        System.out.println("Number");
                        h = readDouble();
                        if (h <= 0) {
                            System.out.println("Error");
                        } else {
                            System.out.println(area.equilateralTriangleArea(h));
                        }
                        break;
                    case 2:
                        System.out.println("Give me base and height");
                        base = readDouble();
                        height = readDouble();
                        if (base <= 0 || b <= 0) {
                            System.out.println("Error");
                        } else {
                            System.out.println(area.triangleArea(base, height));
                        }
                        break;
                    default:
                        System.out.println("This number is invalid");
                }
                break;
            case 3: 
                System.out.println("Name, surname, age, salary");
                per.setName(readString());
                per.setSurname(readString());
                per.setAge(readInt());
                per.setSalary(readDouble());
                System.out.print(per.getName() + " " + per.getSurname());
                System.out.println(" " + per.getAge() + " " + per.getSalary() + " kr");
                //System.out.println(per.toString());
                break;
            case 4: System.out.println("Address, rent, Availability in months");
            house.setAddress(readString());
            house.setRent(readDouble());
            house.setAvailabilityInMonths(readInt());
                System.out.println("Teenant inside: name, surname, age, salary");
                per.setName(readString());
                per.setSurname(readString());
                per.setAge(readInt());
                per.setSalary(readDouble());
                house.setP(per);
                
                System.out.println("House and teenant");
                System.out.print(house.getAddress() + " " + house.getRent());
                System.out.println(" " + house.getAvailabilityInMonths());
                // To work with getP I need to implement toString()
                System.out.print(per.getName() + " " + per.getSurname());
                System.out.println(" " + per.getAge() + " " + per.getSalary() + " kr");
                break;
        }

    }

    public static int readInt() {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        int z = 0;
        String aux;
        boolean ok = false;
        do {
            try {
                aux = keyboard.readLine();
                z = Integer.valueOf(aux);
                ok = true;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());

            }

        } while (ok == false);

        return z;
    }

    public static double readDouble() {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        double z = 0;
        String aux;
        boolean ok = false;
        do {
            try {
                aux = keyboard.readLine();
                z = Double.valueOf(aux);
                ok = true;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());

            }

        } while (ok == false);

        return z;
    }

    public static String readString() {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String a = null;
        try {
            a = keyboard.readLine();
        } catch (Exception e) {
            System.out.println("Ha habido un error" + e.getMessage());
        }

        return a;
    }

}
