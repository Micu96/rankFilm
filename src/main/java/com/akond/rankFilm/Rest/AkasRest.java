package com.akond.rankFilm.Rest;

import com.akond.rankFilm.Entities.Akas;
import com.akond.rankFilm.repositiores.AkasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/imdb/rest/akas")
@RestController
public class AkasRest {


    @Autowired
    private AkasRepository akasRepository;


    @RequestMapping(value = "findByImdbId/{imdbId}", method = RequestMethod.GET)
    public List<Akas> findByImdbId(@PathVariable("imdbId") String imdbId){
        return akasRepository.findByImdbId(imdbId);
    }

}
