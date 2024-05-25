package com.lambda;

import java.util.*;
import java.util.function.Function;

import javax.swing.event.PopupMenuListener;

class ProductItem{
	String name;
	boolean inStock;
	int price;
	
	ProductItem(String name, boolean inStock,int price){
		this.name=name;
		this.inStock=inStock;
		this.price=price;
	}
}

public class SuggestingPriceUsingFunctionalInterface {

	public static void main(String[] args) {
	     ArrayList<ProductItem> al=new ArrayList<ProductItem>();
	     al.add(new ProductItem("Iphone",true, 30000));
	     al.add(new ProductItem("Samsung",false, 20000));
	     al.add(new ProductItem("Oppo",true, 21000));
	     al.add(new ProductItem("Lenovo",true, 19000));
	     al.add(new ProductItem("Readmi",false, 10000));
	     Function<ProductItem,String> fn = n->{
	    	     int cost=n.price;
	    	     boolean stock=n.inStock;
	    	     
	    	     if(cost>10000 && stock)
	    	    	 return n.name;
				return null;
	     };
	     for(ProductItem list:al) {
	    	 String productName=fn.apply(list);
	    	 if(productName !=null)
	    	  System.out.println(productName +" " + "item price is"+" "+ list.price);
	    	 
	     }

	}

}
