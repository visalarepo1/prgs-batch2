

import java.util.ArrayList;

import com.prgs.easyshop.datamodel.Products;
import com.prgs.easyshop.productservice.ProductService;

public class Productcontroller {

	public static void main(String[] args) {
		
	ProductService	productServiceInstance= new ProductService();
	Products p =productServiceInstance.getproduct();
	p.setName("train");p.setPrice(33);
	System.out.println("Product name is" +p.getName() + "and price is"+"" + p.getPrice());
	Products[] p1 =productServiceInstance.getproducts();
	p1[0].setName("Snowball");
	System.out.println(p1[0].getName());
	
	ArrayList<Products>AL=productServiceInstance.getProductsArrayList();
	AL.get(0).setName("Barbiedoll");
	AL.get(1).setName("superman");
	
	System.out.println(AL.get(0).getName()+""+AL.get(1).getName());
	
	}


Products[] getProductsArray(){
	
Products[] listOfProducts=new Products[2];
Products t1=new Products("product1", 10);
t1.setName("product 1");
listOfProducts[0]=t1;
Products t2=new Products("product2", 10);
t2.setName("product 2");

return 	listOfProducts;	
}
ArrayList<Products> AL(){
	ArrayList<Products> listOfProducts= new ArrayList<Products>();
	Products p1= new Products("Batman", 220);
	p1.setName("Batman");
	listOfProducts.add(p1);
	Products p2= new Products("dog", 30);
	p2.setName("dog");
	listOfProducts.add(p2);

	return 	listOfProducts;	
	
	
}
}

