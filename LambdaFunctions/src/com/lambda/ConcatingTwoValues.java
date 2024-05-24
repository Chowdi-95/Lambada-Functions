package com.lambda;

import java.util.function.BiFunction;

public class ConcatingTwoValues {

	public static void main(String[] args) {
		BiFunction<String, String, String> concating=((a,b)->a +' '+b);
		String result=concating.apply("Hello", "World!");
		System.out.println("The concating is:" + result);

	}

}
