package com.prgs.easyshop.productservice;

import com.prgs.easyshop.datamodel.Products;

public class ProductBuilder {
    String productName;
    int productPrice;
    int productRating;

    public Products build() {
        Products product = new Products();
        product.setName(this.productName);
        product.setPrice(this.productPrice);
        product.Discount = this.productRating;

        return product;
    }
    public ProductBuilder withName(String name) {
        this.productName = name;
        return this;
    }
    public ProductBuilder withPrice(int price) {
    	this.productPrice=price;
		return this;
    }
    public ProductBuilder withRating(int rating) {
    	this.productRating=rating;
		return this;
    }
    
}
