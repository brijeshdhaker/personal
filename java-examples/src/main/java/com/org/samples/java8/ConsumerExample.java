/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.samples.java8;

import com.org.samples.models.Movie;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author brijeshdhaker
 */
public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> consumerString = s -> System.out.println(s);
        consumerString.accept("Arpit");
        
        
        List<Movie> listOfMovies = createMovieList();
        Consumer<Movie> consumerForMovie = m -> System.out.println(m);
        listOfMovies.forEach(consumerForMovie);
        
                
    }
    
    public static List<Movie> createMovieList() {
        
        List<Movie> listOfMovies = new ArrayList<>();
        listOfMovies.add(new Movie("Inception", 110));
        listOfMovies.add(new Movie("GodFather", 200));
        listOfMovies.add(new Movie("Forest Gump", 130));
        listOfMovies.add(new Movie("Avengers", 150));
 
        
        return listOfMovies;
    }
}
