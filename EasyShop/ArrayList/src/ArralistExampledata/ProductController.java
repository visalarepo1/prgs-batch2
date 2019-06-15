package ArralistExampledata;
import java.util.ArrayList;

import ArralistExample.ProductService;
import ArralistExample.Products;
public class ProductController{
	static ProductService	productServiceInstance= new ProductService();
	public static void main(String[] args) {
		
		Products p =productServiceInstance.getproduct();
		p.setName("train");p.setPrice(33);
		
		System.out.println("Product name is" +p.getName() + "and price is"+"" + p.getPrice());
		ArrayList<Products>AL=new ArrayList<Products>();
	Products p1=new Products();
	p1.setName("teddy");
	Products p2=new Products();
	p2.setName("cow");
	AL.add(p1);
	AL.add(p2);
	System.out.println(AL.get(0).getName()+""+AL.get(1).getName());
	
	}









	
	
}



