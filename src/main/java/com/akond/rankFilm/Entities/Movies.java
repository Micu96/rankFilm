package com.akond.rankFilm.Entities;

import org.checkerframework.checker.units.qual.C;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movies {

    @Id
    @Column(name = "imdb_id")
    private String imdbId;
    @Column(name ="ratings")
    private int ratings;
    @Column(name = "votes_number")
    private long votesNumber;
    @Column(name = "title_type")
    private String titleType;
    @Column(name = "primary_title")
    private String primaryTitle;
    @Column(name = "original_title")
    private String originalTitle;
    @Column(name = "is_adult")
    private boolean isAdult;
    @Column(name = "start_year")
    private String startYear;
    @Column(name = "end_year")
    private String endYear;
    @Column(name = "runtime_minutes")
    private String runtimeMinutes;
    @Column(name = "generes_1")
    private String generes1;
    @Column(name = "generes_2")
    private String generes2;
    @Column(name = "generes_3")
    private String generes3;




    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public long getVotesNumber() {
        return votesNumber;
    }

    public void setVotesNumber(long votesNumber) {
        this.votesNumber = votesNumber;
    }

    public String getTitleType() {
        return titleType;
    }

    public void setTitleType(String titleType) {
        this.titleType = titleType;
    }

    public String getPrimaryTitle() {
        return primaryTitle;
    }

    public void setPrimaryTitle(String primaryTitle) {
        this.primaryTitle = primaryTitle;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public String getRuntimeMinutes() {
        return runtimeMinutes;
    }

    public void setRuntimeMinutes(String runtimeMinutes) {
        this.runtimeMinutes = runtimeMinutes;
    }

    public String getGeneres1() {
        return generes1;
    }

    public void setGeneres1(String generes1) {
        this.generes1 = generes1;
    }

    public String getGeneres2() {
        return generes2;
    }

    public void setGeneres2(String generes2) {
        this.generes2 = generes2;
    }

    public String getGeneres3() {
        return generes3;
    }

    public void setGeneres3(String generes3) {
        this.generes3 = generes3;
    }
}
