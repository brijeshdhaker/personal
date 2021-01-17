/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.samples.java8;

import com.org.samples.models.Movie;
import java.util.function.Supplier;

/**
 *
 * @author brijeshdhaker
 */
public class SupplierExample {

    
    public static void main(String[] args) {
        /* Supplier is functional interface which does not take any argument and produces result of type T */
        Supplier<String> supplier = () -> "Arpit";
        System.out.println(supplier.get());
        
        Supplier<Movie> movieSupplier = () -> new Movie("Sholey", 210);
        System.out.println(movieSupplier.get().toString());
    }
}
