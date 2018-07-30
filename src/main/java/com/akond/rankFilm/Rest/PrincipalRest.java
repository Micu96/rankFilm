package com.akond.rankFilm.Rest;


import com.akond.rankFilm.Entities.Principal;
import com.akond.rankFilm.repositiores.PrincipalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/imdb/rest/principal")
public class PrincipalRest {

    @Autowired
    PrincipalRepository principalRepository;

    @RequestMapping(path = "/findByNameId/{nameId}")
    public List<Principal> findByNameId(@PathVariable("nameId") String nameId){

        return principalRepository.findByNameId(nameId);
    }

}
