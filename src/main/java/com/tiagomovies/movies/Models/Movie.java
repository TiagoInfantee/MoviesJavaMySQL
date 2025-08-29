package com.tiagomovies.movies.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String category;
    private int year;

    public Movie(){

    }


    public Movie(
        int id, 
        String title, 
        String category, 
        int year) {

            this.id = id;
            this.title = title;
            this.category = category;
            this.year = year;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
}