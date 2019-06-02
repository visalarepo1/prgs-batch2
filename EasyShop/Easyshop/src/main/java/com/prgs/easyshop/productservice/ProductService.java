package com.prgs.easyshop.productservice;

import java.util.ArrayList;

import com.prgs.easyshop.datamodel.Products;

public class ProductService {

	
public Products getproduct(){
		
Products p1=new Products("car",20);
//p1.setName("car");
//p1.setPrice(20);
return p1;
}

	


public Products[] getproducts() {
	Products t1=new Products("product1", 10);
	//t1.setName("product 1");
	Products[] listOfProducts=new Products[2];

	listOfProducts[0]=t1;
	Products t2=new Products("cargo", 50);
	//t2.setName("product 2");
	return 	listOfProducts;	
	
}




public ArrayList<Products> getProductsArrayList() {
	ArrayList<Products> listOfProducts= new ArrayList<Products>();
	Products p1= new Products("Batman", 10);
	//p1.setName("Batman");
	p1.setPrice(10);
	listOfProducts.add(p1);
	Products p2= new Products("superman", 20);
	listOfProducts.add(p2);
	return 	listOfProducts;	
	
}

}
