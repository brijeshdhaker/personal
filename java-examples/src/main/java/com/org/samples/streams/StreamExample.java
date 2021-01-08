/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.samples.streams;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brijeshdhaker
 */
public class StreamExample {
    
    public static void main(String[] args) {
        
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        // Filter
        System.out.println("\n\n //Filter");
        stringCollection.stream()
        .filter((s) -> s.startsWith("a"))
        .forEach(System.out::println);
        
        // Sorted
        System.out.println("\n\n //Sorted");
        stringCollection
        .stream()
        .sorted()
        .filter((s) -> s.startsWith("a"))
        .forEach(System.out::println);
        
        
    }
    
    
}
