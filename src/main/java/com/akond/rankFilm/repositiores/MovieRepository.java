package com.akond.rankFilm.repositiores;

import com.akond.rankFilm.Entities.Movies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository <Movies, String> {

    Movies findByImdbId(String imdbId);
}
