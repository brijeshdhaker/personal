/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.samples.models;

/**
 *
 * @author brijeshdhaker
 */
public class Movie {
    String movieName;
    long duration;
 
    public Movie(String movieName, long duration) {
        super();
        this.movieName = movieName;
        this.duration = duration;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }
    
    @Override
    public String toString() {
        return "Movie Name: " + this.getMovieName() + "|| " 
        + "Movie duration: " + this.getDuration();
 
    }
}
