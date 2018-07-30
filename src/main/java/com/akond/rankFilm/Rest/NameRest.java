package com.akond.rankFilm.Rest;

        import com.akond.rankFilm.Entities.Name;
        import com.akond.rankFilm.repositiores.NameRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("imdb/rest/name")
public class NameRest {

    @Autowired
    NameRepository nameRepository;

    @RequestMapping(path= "/findByPrimaryName/{primaryName}",method = RequestMethod.GET)
    public List<Name> findByPrimaryName(@PathVariable("primaryName") String primaryName){
        return nameRepository.findByPrimaryName(primaryName);
    }





}
