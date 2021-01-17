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
        
        List<String> records = new ArrayList<>();
        records.add("ddd2");
        records.add("aaa2");
        records.add("bbb1");
        records.add("aaa1");
        records.add("bbb3");
        records.add("ccc");
        records.add("bbb2");
        records.add("ddd1");

        
        // Filter
        System.out.println("\n\n //Filter");
        records.stream()
        .filter((s) -> s.startsWith("a"))
        .forEach(System.out::println);
        
        // Sorted
        System.out.println("\n\n //Sorted");
        records
        .stream()
        .sorted()
        .filter((s) -> s.startsWith("a"))
        .forEach(System.out::println);
        
        
    }
    
    
}
