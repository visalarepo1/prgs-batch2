package com.prgs.easyshop.controller;

import com.prgs.easyshop.productservice.ProductService;

public class Productcontroller {

	public static void main(String[] args) {
		
	ProductService	productServiceInstance= new ProductService();
	productServiceInstance.getproducts();
	}

}
