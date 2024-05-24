package com.lambda;

import java.util.function.Function;

public class lambdaDemo {

	public static void main(String[] args) {
		Function<Integer,Integer> add=(x->x + x);
		int result=add.apply(10);
		System.out.println(result);

	}

}
