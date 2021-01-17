/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.samples.java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author brijeshdhaker
 */
public class CollectorsExample {
    public static void main(String[] args) {
        
        List<Integer> intList=Arrays.asList(10,20,30,40,50);
        // Counting
        long  count = (long) intList.stream().collect(Collectors.counting());
        System.out.println(count);
        
        // Averaging int
        Double result1 = intList.stream().collect(Collectors.averagingInt(v->v));
        System.out.println(result1);
        
        Double result2 = intList.stream().collect(Collectors.averagingInt(v->v*v));
        System.out.println(result2);
        
        // Suming int
        Integer result3 = intList.stream().collect(Collectors.summingInt(v->v));
        System.out.println(result3);
        
        // collectingAndThen
        int result4 = intList.stream().collect(Collectors.collectingAndThen(Collectors.summingInt(v->(int)v),result->result/2));
        System.out.println(result4);
        
    }
}
