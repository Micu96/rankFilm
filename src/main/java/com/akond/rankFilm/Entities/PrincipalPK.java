package com.akond.rankFilm.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.poi.ss.formula.functions.Na;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


public class PrincipalPK implements Serializable {


  private String imdbId;

  private String nameId;

   public PrincipalPK(String imdbId, String nameId) {
      this.imdbId = imdbId;
      this.nameId = nameId;
   }


   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      PrincipalPK that = (PrincipalPK) o;
      return Objects.equals(imdbId, that.imdbId) &&
              Objects.equals(nameId, that.nameId);
   }

   @Override
   public int hashCode() {

      return Objects.hash(imdbId, nameId);
   }

   public PrincipalPK() {
   }

   public String getImdbId() {
      return imdbId;
   }

   public void setImdbId(String imdbId) {
      this.imdbId = imdbId;
   }

   public String getNameId() {
      return nameId;
   }

   public void setNameId(String nameId) {
      this.nameId = nameId;
   }
}
