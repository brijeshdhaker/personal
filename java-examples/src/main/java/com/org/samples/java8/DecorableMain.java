/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.samples.java8;

/**
 *
 * @author brijeshdhaker
 */
public class DecorableMain {
    
    public static void main(String[] args) {
                // Using lambada expression
        Decorable dec =() -> { System.out.println("Decorating with curtains"); };
        dec.decorateWithCurtains();
    }
}
