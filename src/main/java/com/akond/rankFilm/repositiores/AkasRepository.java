package com.akond.rankFilm.repositiores;

import com.akond.rankFilm.Entities.Akas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AkasRepository extends JpaRepository<Akas,String> {


    List<Akas> findByImdbId(String imdbId);
}
