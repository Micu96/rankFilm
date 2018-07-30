package com.akond.rankFilm.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.*;
import javax.validation.constraints.Null;
import java.util.List;

@Entity
public class Name {


    @Id
    @Column(name="name_id")
    private String nameId;
    @Column(name="primary_name")
    private String primaryName;
    @Column(name="birth_year")
    private Integer birthYear;
    @Column(name="death_year")
    private Integer deathYear;

    @JsonIgnoreProperties("name")
    @OneToMany(mappedBy = "name")
    private List<Principal> principals;

    public void setPrincipals(List<Principal> principals) {
        this.principals = principals;
    }

    public List<Principal> getPrincipals() {
        return principals;
    }

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    public String getPrimaryName() {
        return primaryName;
    }

    public void setPrimaryName(String primaryName) {
        this.primaryName = primaryName;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(Integer deathYear) {
        this.deathYear = deathYear;
    }

}
