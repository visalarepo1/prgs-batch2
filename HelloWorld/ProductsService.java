import java.util.ArrayList;

class PS {

  Product getProduct() {
  }

  Product[] getProductsArray() {

    Product[] listOfProducts = new Product[2];

    Product p1 = new Product();
    p1.name = "product 1";
    listOfProducts[0] = p1;

    Product p2 = new Product();
    p2.name = "product 2";
    listOfProducts[1] = p2;

    return listOfProducts;
  }

  ArrayList<Product> getProductsArrayList() {

    ArrayList listOfProducts = new ArrayList<Product>();

    Product p1 = new Product();
    listOfProducts.add(p1);

    Product p2 = new Product();
    listOfProducts.add(p2);

    return listOfProducts;
  }

}

class ProdCont {

  test () {

    // sampleProd with name old returnd from service
    Product[] productFromService = productService.getProduct();
        // sampleProd but different from above with name old returnd from service
    Product[] p2 = productService.getProduct();
    p2.name = "New name";
    System.out.print("name of productFormService:"+productFromService.name);
  }

  testArrayList() {
    ArrayList<Product> productList = productService.getProduct();

    for(Product p: productList) {
      System.out.println("product name: "+ p.name);
    }

  }

}