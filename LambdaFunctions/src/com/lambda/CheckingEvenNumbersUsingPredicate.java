package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CheckingEvenNumbersUsingPredicate {

	public static void main(String[] args) {
		List<Integer> arr= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Predicate<Integer> isEven=n->n%2!=0;
		List<Integer> oddNumbers=arr.stream().filter(isEven).collect(Collectors.toList());
		System.out.println("Even numbers are :" + oddNumbers);

	}

}
