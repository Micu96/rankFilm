package com.akond.rankFilm.repositiores;

import com.akond.rankFilm.Entities.Movies;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository <Movies, String> {

    //Movies findByImdbId(String imdbId);

    Movies findByImdbId(String imdbId);

    List <Movies> findAllByStartYearBetween(String start, String end);

    List<Movies> findAllByRuntimeMinutes(String minutes);

    List <Movies> findByPrimaryTitle(String title);






}