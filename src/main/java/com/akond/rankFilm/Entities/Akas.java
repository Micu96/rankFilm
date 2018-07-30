package com.akond.rankFilm.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@IdClass(AkasPK.class)
public class Akas implements Serializable{


    @Id
    @Column(name = "imdb_id")
    private String imdbId;
    @Column(name = "ordering")
    private int ordering;
    @Column(name = "title")
    private String title;
    @Column(name = "region")
    private String region;
    @Column(name = "language")
    private String language;
    @Column(name = "is_original_title")
    private boolean isOriginalTitle;

    @JsonIgnoreProperties("movies")
    @ManyToOne
    @JoinColumn(name = "imdb_id", updatable = false, insertable = false)
    private Movies movies;


    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isOriginalTitle() {
        return isOriginalTitle;
    }

    public void setOriginalTitle(boolean originalTitle) {
        isOriginalTitle = originalTitle;
    }



}