

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Productcontroller {
	

@RequestMapping(value="/Products")
ArrayList<Products> AL(){
	ArrayList<Products> listOfProducts= new ArrayList<Products>();
	Products p1= new Products("Batman", 220);
	p1.setName("Batman");
	listOfProducts.add(p1);
	Products p2= new Products("dog", 30);
	p2.setName("dog");
	listOfProducts.add(p2);
	for (Products lang : listOfProducts) {
        
        System.out.printf("%s ", lang);
    }
    
    System.out.println();

	return 	listOfProducts;	
	
	
}
}

