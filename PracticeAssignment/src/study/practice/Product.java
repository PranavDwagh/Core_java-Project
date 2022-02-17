package study.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable {

	String productName;
	int  cost;
	String desc;
	String brand;
	
	public Product()
	{
		//
	}
	
	public Product(String name, int c, String d, String b)
	{
		productName = name;
		cost = c;
		desc = d;
		brand = b;
		
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", cost=" + cost + ", desc=" + desc + ", brand=" + brand + "]";
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public static void main(String[] args) throws IOException {
		
	ObjectOutputStream oos = null;
	try {
		oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\A191\\Desktop\\Core_Java\\Java\\Revision\\product.txt"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	
	Product [] arr = new Product[3];
	Scanner sc = new Scanner(System.in);
	
	for (int i=0; i<arr.length;i++)
	{
		System.out.println("Enter name of the Product");
		String s = sc.next();
		
		System.out.println("Enter Cost of the Product");
		int cost = sc.nextInt();
		
		System.out.println("Enter Brand");
		String brand = sc.next();
		
		System.out.println("Enter Description");
		String desc = sc.next();
		
		arr[i] = new Product(s, cost, desc, brand);
		
		oos.writeObject(arr[i]);
	}
	
		
	}// end of main
	
	
}// end of class



