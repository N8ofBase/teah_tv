package com.prismcortex.teah_tv.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movies {

    @Id
    @GeneratedValue
    private int movie_id;


    private String title;


    private int year_released;


    private String director;


    private String category;


    private String disc;


    private String location;

    public Movies() {
    }

    public Movies(String aTitle, int aYear_released, String aDirector, String aCategory,
                  String aDisc, String aLocation) {
        this.title = aTitle;
        this.year_released = aYear_released;
        this.director = aDirector;
        this.category = aCategory;
        this.disc = aDisc;
        this.location = aLocation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear_released() {
        return year_released;
    }

    public void setYear_released(int year_released) {
        this.year_released = year_released;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMovie_id() {
        return movie_id;
    }
}
