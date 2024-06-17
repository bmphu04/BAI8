
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC MSI
 */
public class Product implements Comparable<Product> {
    private String productName;
    private String productId;
    private double productPrice;

    public Product(String productName, String productId, double productPrice) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.productPrice, other.productPrice);
    }

    @Override
    public String toString() {
        return "Product [productName=" + productName + ", productId=" + productId + ", productPrice=" + productPrice + "]";
    }
}
