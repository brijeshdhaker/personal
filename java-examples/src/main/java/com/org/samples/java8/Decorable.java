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
@FunctionalInterface
public interface Decorable {
    
    // only one abstract method
    void decorateWithCurtains();

    // default method
    default void decorateWithPaints() {
        System.out.println("Decorating using paints");
    }

    // Overriding method of java.lang.Object
    @Override
    public int hashCode();
}
