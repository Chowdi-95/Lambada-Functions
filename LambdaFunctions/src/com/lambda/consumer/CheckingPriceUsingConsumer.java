package com.consumer;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Product{
	String name;
	boolean inStock;
	int price;
	
	Product(String name,boolean inStock, int price){
		this.name=name;
		this.inStock=inStock;
		this.price=price;
	}
}


public class CheckingPriceUsingConsumer {

	public static void main(String[] args) {
		ArrayList<Product> al = new ArrayList<Product>();
		al.add(new Product("Iphone",true,35000));
		al.add(new Product("Samsung",false,15000));
		al.add(new Product("Oppo",true,20000));
		al.add(new Product("Realme",false,11000));
		al.add(new Product("Vivo",true,10000));
		
		//function
		Function<Product,Integer> f = n->{
   	     boolean stock=n.inStock;
   	      if(n.price>10000 && stock) {
   	    	int cost=n.price;
			cost=cost-(cost*5)/100;
			return cost;
   	      }
   	      return 1;
   	      
		};
		//predicate
		Predicate<Integer> p = e->e>10000;
		
		//consumer
		Consumer<Product> c = a->{
			 System.out.println("The Product is "+ a.name + " and Original Price is "+" "+a.price);
			 
		};
		
		for(Product item:al) {
			int costPrice=f.apply(item);
			if(p.test(costPrice)) {
				c.accept(item);
				System.out.println("After discount the item price is" +" " +costPrice);
				
			}
		}
		
		

	}

}
