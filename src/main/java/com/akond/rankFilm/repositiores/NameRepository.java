package com.akond.rankFilm.repositiores;

import com.akond.rankFilm.Entities.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NameRepository extends JpaRepository<Name,String>{

    List<Name> findByPrimaryName(String primaryName);


}
