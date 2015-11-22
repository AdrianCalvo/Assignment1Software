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
public class House {
    private Person p;
    private String address;
    private double rent;
    private int availabilityInMonths;
    

//    

    public int getAvailabilityInMonths() {
        return availabilityInMonths;
    }

    public void setAvailabilityInMonths(int availabilityInMonths) {
        this.availabilityInMonths = availabilityInMonths;
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) throws Exception {
       if(p.isUpper18()== true && p.salaryIsUpperThan12000()==true){
           this.p = p;
       } 
       else {
           throw new Exception();
       }
    }
        

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }
  
}
