package com.prgs.easyshop.productservice;

import com.prgs.easyshop.datamodel.Products;
public class  Service {
public static void main(String[] args) {

  {

        Products productPSP = new ProductBuilder()
                                .withName("psp")
                                .withPrice((int) 299.99)
                               .build();
        Products  ferrywheel=new ProductBuilder().withName("ferrywheel")
        		.withPrice(20).withRating(4).build();
        System.out.println(ferrywheel.getName()+ ferrywheel.getPrice());
        System.out.println(productPSP.getName()+ productPSP.getPrice());
    }

}}
