//package com.akond.rankFilm.Entities;
//
//import java.io.Serializable;
//import java.util.Objects;
//
//public class OscarsPK implements Serializable{
//
//    private String title;
//    private String winningYear;
//
//    public OscarsPK() {
//    }
//
//    public OscarsPK(String title, String winningYear) {
//        this.title = title;
//        this.winningYear = winningYear;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getWinningYear() {
//        return winningYear;
//    }
//
//    public void setWinningYear(String winningYear) {
//        this.winningYear = winningYear;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        OscarsPK oscarsPK = (OscarsPK) o;
//        return Objects.equals(title, oscarsPK.title) &&
//                Objects.equals(winningYear, oscarsPK.winningYear);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(title, winningYear);
//    }
//}
