package com.prgs.array;


public  class Products {
	
private  String name;
	private int price;
public int Discount=10;
public Products(String name, int price) {
	
}
	public Products() {
	
}
	public int CalcDiscPrice(){
		 int FinalPrice;
		 if (getPrice() <10 ||Discount>=getPrice() ) {
			
					 return getPrice();
					 
		 }else { FinalPrice=(getPrice() - Discount);
			
		 
	return FinalPrice;
	}
	}

	public String getName() {
		return name;
	}

	public void setName(String Name) {
		this.name = Name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int Price) {
		this.price = Price;
	}}

		
		
	
	


