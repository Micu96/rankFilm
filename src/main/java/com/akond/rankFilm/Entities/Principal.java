package com.akond.rankFilm.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
@IdClass(PrincipalPK.class)
public class Principal {

    @Id
    @Column(name="imdb_id")
    private String imdbId;
    @Column(name ="ordering")
    private int ordering;
    @Id
    @Column(name="name_id")
    private String nameId;
    @Column(name = "role")
    private String role;

    @JsonIgnoreProperties("principals")
    @ManyToOne
    @JoinColumn(name = "name_id",insertable = false,updatable = false)
    private Name name;


    @JsonIgnoreProperties({
            "akas",
            "principals",
            "movies"
    })
    @ManyToOne
    @JoinColumn(name = "imdb_id",insertable = false,updatable = false)
    private Movies movies;



    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Movies getMovies() {
        return movies;
    }

    public void setMovies(Movies movies) {
        this.movies = movies;
    }

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

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Principal principal = (Principal) o;
//        return ordering == principal.ordering &&
//                Objects.equals(imdbId, principal.imdbId) &&
//                Objects.equals(nameId, principal.nameId) &&
//                Objects.equals(role, principal.role) &&
//                Objects.equals(name, principal.name) &&
//                Objects.equals(movies, principal.movies);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(imdbId, ordering, nameId, role, name, movies);
//    }
}
