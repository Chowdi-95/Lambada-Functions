package com.lambda;

import java.util.function.Predicate;

public class CheckingStringLength {

	public static void main(String[] args) {
		String names[]= {"David", "Rakesh", "Rupa","Ravi", "Raji"};
		for(String name:names) {
			Predicate<String> pr=  s->(s.length()>4);
			if(pr.test(name)) {
				System.out.println(name);
			}
		}
	}

}
