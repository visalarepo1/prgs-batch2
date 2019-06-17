
package ProductDetailsform;

public class ProductGreeting {

    public int id;
    public String content;
  public  ProductGreeting(String name,int id){
		this.content=name;
		this.id=id;
	}
   

    public ProductGreeting() {
	int id;
	String name;
}


	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}




