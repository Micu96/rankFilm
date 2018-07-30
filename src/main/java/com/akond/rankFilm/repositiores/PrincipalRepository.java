package com.akond.rankFilm.repositiores;

import com.akond.rankFilm.Entities.Principal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.xml.bind.JAXBPermission;
import java.util.List;

@Repository
public interface PrincipalRepository extends JpaRepository<Principal,String> {

   List<Principal> findByNameId(String nameId);




}
