package com.akond.rankFilm.Rest;


import com.akond.rankFilm.Entities.Movies;
import com.akond.rankFilm.repositiores.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.example.jdbc.demo.jdbc.Services.MovieSerivce;

@RestController
@RequestMapping("/imdb/rest")
public class MovieRest {

    @Autowired
    MovieRepository movieRepository;



    @RequestMapping(path = "/findByImdbId/{imdbId}",method = RequestMethod.GET)
    public Movies findByImdbId(@PathVariable("imdbId") String imdbId){
        return movieRepository.findByImdbId(imdbId);
    }


}
