/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.samples.java8;

import java.util.function.Predicate;

/**
 *
 * @author brijeshdhaker
 */
public class PredicateExample {
    
    public static void main(String[] args) {
        Predicate <Integer> predicate = i -> (i > 100);
        boolean greaterCheck = predicate.test(200);
        System.out.println("is 200 greater than 100: "+greaterCheck);
    }
    
}
