package com.akond.rankFilm.Rest;


import com.akond.rankFilm.Entities.Movies;
import com.akond.rankFilm.repositiores.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/imdb/rest/movies")
public class MovieRest {

    @Autowired
    MovieRepository movieRepository;

    @RequestMapping(path = "/findByImdbId/{imdbId}",method = RequestMethod.GET)
    public Movies findByImdbId(@PathVariable("imdbId") String imdbId){
        return movieRepository.findByImdbId(imdbId);
    }

    @RequestMapping(path = "/findAllByStartYearBetweend/{start}/-/{end}",method = RequestMethod.GET)
    public List<Movies> findAllByStartYearBetween(@PathVariable("start") String start, @PathVariable("end") String end){
        return movieRepository.findAllByStartYearBetween(start,end);
    }
    @RequestMapping(path = "findAllByRuntimeMinutes/{minutes}", method = RequestMethod.GET)
    public List<Movies> findAllByRuntmieMinutes(@PathVariable("minutes") String minutes){
        return movieRepository.findAllByRuntimeMinutes(minutes);
    }
    @RequestMapping(path = "findByTitle/{title}",method = RequestMethod.GET)
    public List <Movies> findByTitle(@PathVariable("title") String title){
        return movieRepository.findByPrimaryTitle(title);
    }



}
