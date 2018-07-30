package com.akond.rankFilm.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.checkerframework.checker.units.qual.A;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;


public class AkasPK implements Serializable{

    private String imdbId;
    private int ordering;

    public AkasPK(String imdbId,int ordering) {
        this.imdbId = imdbId;
        this.ordering = ordering;
    }
    public AkasPK(){

    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AkasPK akasPK = (AkasPK) o;
        return ordering == akasPK.ordering &&
                Objects.equals(imdbId, akasPK.imdbId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(imdbId, ordering);
    }
}
