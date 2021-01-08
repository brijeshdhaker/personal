/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.samples.main;

import com.org.samples.models.Person;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author brijeshdhaker
 */
public class HelloWorld {
 
    public static void main(String[] args) {
        
        List<Person> persons = Arrays.asList(
            new Person("Max", 18),
            new Person("Peter", 23),
            new Person("Pamela", 23),
            new Person("David", 12)
        );

        List<Person> filtered = persons.stream()
            .filter(p -> p.name.startsWith("P"))
            .collect(Collectors.toList());

        System.out.println(filtered);    // [Peter, Pamela]
        
    }
}
