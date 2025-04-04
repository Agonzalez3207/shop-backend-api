package com.shopdemo.springbootstart.product;

public class Product {
	
	private String productId;
	private String productName;
	private String productBrand;
	private String productDescription;
	private String productPrice;
	private int productQty;
	
	
	
	
	
	//Constructor
	public Product(String productId, String productName, String productBrand, String productDescription,
			String productPrice, int productQty) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productBrand = productBrand;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productQty = productQty;
	}
	
	public Product() {
	}
	
	
	
	//Getters and Setters
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQty() {
		return productQty;
	}
	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	
	
	
	
}
