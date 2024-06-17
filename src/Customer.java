/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC MSI
 */
public class Customer extends Person {
    private String country;

    public Customer(String name, int age, String sex, String country) {
        super(name, age, sex);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Customer{" + "country=" + country + '}';
    }

    @Override
    public void language() {
        switch (country) {
            case "USA":
                System.out.println("English"); 
                break;
           case "VN":
                System.out.println("Vietnamese");
                break;
            case "JP":
                System.out.println("Japanese");
                break;
            default:
                System.out.println("Unknown");
                break;
        }
    }
    
}

