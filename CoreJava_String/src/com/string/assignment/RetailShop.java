package com.string.assignment;

import java.util.Scanner;

public class RetailShop {
	
	
	String shopName; 
	String shopAddress; 
	String products[];
	
	

	public RetailShop(String shopName, String shopAddress, String[] products) {
		super();
		this.shopName = shopName;
		this.shopAddress = shopAddress;
		this.products = products;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopAddress() {
		return shopAddress;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String[] getProducts() {
		return products;
	}

	public void setProducts(String[] products) {
		this.products = products;
	}

	
	public boolean checkProductAvailability(String productname)
	{
		boolean flag=false;
		for(int i=0;i<products.length;i++)
		{
		if(products[i].equalsIgnoreCase(productname))
		{
			flag=true;
			break;
		}
		}
		return flag;
		
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the shopname:");
		String shop=sc.next();
		System.out.println("Enter the address:");
		String add = sc.next();
		System.out.println("Enter number of products:");
		int prod= sc.nextInt();
		
		if(prod>0)
		{

			String products[] = new String[prod];
			
			for(int i=0;i<products.length;i++)
			{
				products[i]=sc.next();
				
			}
			
			System.out.println("Enter the product to be searched: ");
	        String productName=sc.next();
	        
	        RetailShop obj = new RetailShop(shop, add, products);
	        
	        if(obj.checkProductAvailability(productName))
	        {
	        	System.out.println("Product is available at "+shop+", "+add+".");
	        }
	        else
	        {
	        	System.out.println("Product is not available at "+shop+", "+add+".");	
	        }
		}
	}

}
