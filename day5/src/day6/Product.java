package day6;

import java.io.Serializable;

public class Product implements Serializable{
 int productId;
 String productName = new String();
 int price;
public Product(int productId, String productName, int price) {
	this.productId = productId;
	this.productName = productName;
	this.price = price;
	
	
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
}
 
}
