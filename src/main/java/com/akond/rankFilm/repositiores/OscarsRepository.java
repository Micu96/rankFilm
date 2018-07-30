package com.akond.rankFilm.repositiores;

import com.akond.rankFilm.Entities.Oscars;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OscarsRepository extends JpaRepository<Oscars,String> {

    Oscars findByImdbId(String imdbId);
    List<Oscars> findByWinningYear(String year);


}
