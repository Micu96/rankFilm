package com.akond.rankFilm.Rest;

import com.akond.rankFilm.Entities.Oscars;
import com.akond.rankFilm.repositiores.OscarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("imdb/rest/oscars")
public class OscarsRest {

    @Autowired
    OscarsRepository oscarsRepository;



    @RequestMapping(path = "findAll", method = RequestMethod.GET)
    public List<Oscars> oscars(){
        return oscarsRepository.findAll();
    }
    @RequestMapping(path = "findByImdbId/{imdbId}",method = RequestMethod.GET)
    public Oscars oscars(@PathVariable("imdbId") String imdbId){
        return oscarsRepository.findByImdbId(imdbId);
    }
    @RequestMapping(path = "winningYear={year}",method = RequestMethod.GET)
    public List <Oscars> winningYear(@PathVariable("year") String year){
        return oscarsRepository.findByWinningYear(year);
    }


}
