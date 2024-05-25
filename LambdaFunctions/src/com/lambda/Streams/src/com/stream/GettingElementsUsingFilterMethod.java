package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GettingElementsUsingFilterMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            List<Integer> numberList=Arrays.asList(1,2,3,43,24,55,43,65,67,34,22,76);
            
            //filter even numbers and store into one list
            List<Integer> evenNumbers=numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
            System.out.println(evenNumbers);
	}

}
