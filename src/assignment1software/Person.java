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
public class Person {
    private String name;
    private String surname;
    private int age;
    private double salary;

//    @Override
//    public String toString() {
//        return name + surname + age + salary;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public boolean isUpper18(){
        if (this.age >= 18){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public boolean salaryIsUpperThan12000(){
        if (this.salary >= 12000){
            return true;
        }
        else {
            return false;
        }

    }
}
