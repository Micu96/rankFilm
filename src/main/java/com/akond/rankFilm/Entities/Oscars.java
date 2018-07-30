package com.akond.rankFilm.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.checkerframework.checker.units.qual.C;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Oscars{

    @Id
    @Column(name = "imdb_id")
    private String imdbId;
    @Column(name = "title")
    private String title;
    @Column(name = "w_year")
    private String winningYear;
    @Column(name = "award")
    private String award;
    @Column(name = "nomination")
    private String nomination;
    @Column(name = "best_picture")
    private String isBestPicture;

    @JsonIgnoreProperties("principals")
    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "imdb_id", updatable = false, insertable = false)
    })
    private Movies movies;

    public Oscars() {
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWinningYear() {
        return winningYear;
    }

    public void setWinningYear(String winningYear) {
        this.winningYear = winningYear;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public String getNomination() {
        return nomination;
    }

    public void setNomination(String nomination) {
        this.nomination = nomination;
    }

    public String getIsBestPicture() {
        return isBestPicture;
    }

    public void setIsBestPicture(String isBestPicture) {
        this.isBestPicture = isBestPicture;
    }

    public Movies getMovies() {
        return movies;
    }

    public void setMovies(Movies movies) {
        this.movies = movies;
    }
}
