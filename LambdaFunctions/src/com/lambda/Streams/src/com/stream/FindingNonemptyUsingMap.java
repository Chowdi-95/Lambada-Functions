package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;



public class FindingNonemptyUsingMap {

	public static void main(String[] args) {
		
		        List<Optional<String>> optionals = Arrays.asList(
		            Optional.of("A"),
		            Optional.empty(),
		            Optional.of("B"),
		            Optional.empty(),
		            Optional.of("C")
		        );

		        // Map each non-empty optional to its content
		        List<String> values = optionals.stream()
		                                       .filter(Optional::isPresent)
		                                       .map(Optional::get)
		                                       .collect(Collectors.toList());
		        
		        System.out.println("Values: " + values);
		    }
		


	}


