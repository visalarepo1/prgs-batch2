import java.awt.List;
import java.util.ArrayList;

import com.prgs.easyshop.datamodel.BabyProducts;
import com.prgs.easyshop.datamodel.BoardGames;
import com.prgs.easyshop.datamodel.Electronictoy;
import com.prgs.easyshop.datamodel.Products;

public class ProductMain {

	public static void main(String[] args) {
	Products	toy= new BabyProducts("String", 0 );
	toy.setName("train");
	toy.setPrice(5);
	Products	toy2= new BoardGames("chess",20);
	toy2.setName("chess");
	toy2.setPrice(15);
	Products	toy3= new Electronictoy("name",10);
	toy3.setName("aeroplane");
	toy3.setPrice(10);
	ArrayList<Products> arrayList=new ArrayList<Products>();
	arrayList.add(toy);
	arrayList.add(toy2);
	arrayList.add(toy3);
	for(Products p:arrayList) {
	System.out.println(p.getName()+p.CalcDiscPrice());
	}

}}
