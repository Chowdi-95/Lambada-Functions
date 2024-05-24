package com.lambda;

import java.util.*;
import java.util.function.Predicate;

class product{
	String name;
	boolean inStock;
	
	product(String name,boolean inStock){
		this.name=name;
		this.inStock=inStock;
	}
	@Override
	public String toString() {
		return name;
	}
}

public class CheckingListUsingPredicate {

	public static void main(String[] args) {
		ArrayList<product> al= new ArrayList<product>();
		al.add(new product("IPhone",true));
		al.add(new product("Lenovo",false));
		al.add(new product("Dell",true));
		al.add(new product("Samsung",true));
		al.add(new product("Oppo",false));
		Predicate<product> pr =e->(e.name.equals("IPhone") && e.inStock);
		for(product r:al) {
		//Predicate<product> pr =e->(e.name.equals("IPhone") && e.inStock);
		if(pr.test(r)) {
			System.out.println(r);
		}else {
			System.out.println("Product not in stock");
		}
		

	}

}
}
