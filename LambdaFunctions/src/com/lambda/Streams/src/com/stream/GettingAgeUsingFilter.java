package com.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
    
public class GettingAgeUsingFilter {

	public static void main(String[] args) {
		        List<Person> people = Arrays.asList(
		            new Person("John", 30),
		            new Person("Jane", 25),
		            new Person("Tom", 35),
		            new Person("Lucy", 20)
		        );

		        // Filter people older than 25
		        List<Person> olderThan25 = people.stream()
		                                         .filter(person -> person.age > 25)
		                                         .collect(Collectors.toList());
		        
		        System.out.println("People older than 25: " + olderThan25);
		    }
		


	}


