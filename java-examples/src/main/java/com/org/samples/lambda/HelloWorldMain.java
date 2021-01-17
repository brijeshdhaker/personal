/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.samples.lambda;

import com.org.samples.java8.HelloWorld;

/**
 *
 * @author brijeshdhaker
 */
public class HelloWorldMain {
    
    public static void main(String args[]) {
        // Lambda Expression 
        HelloWorld helloWorld = () -> {
            System.out.println("Hello using Lambda Expression");
            System.out.println("Hello using Lambda Expression");
        };
        helloWorld.sayHello();
    }
    
}
