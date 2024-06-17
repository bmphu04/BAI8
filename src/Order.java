
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC MSI
 */
public class Order {
    private String Orderid;
    private String Datecreated;
    private Customer customer;
    private List<Product> product;

    public Order(String Orderid, String Datecreated, Customer customer, List<Product> product) {
        this.Orderid = Orderid;
        this.Datecreated = Datecreated;
        this.customer = customer;
        this.product = product;
    }

    public String getOrderid() {
        return Orderid;
    }

    public void setOrderid(String Orderid) {
        this.Orderid = Orderid;
    }

    public String getDatecreated() {
        return Datecreated;
    }

    public void setDatecreated(String Datecreated) {
        this.Datecreated = Datecreated;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

   

    @Override
    public String toString() {
        return "Order{" + "Orderid=" + Orderid + ", Datecreated=" + Datecreated + ", customer=" + customer + ", product=" + product + '}';
    }
    
}
