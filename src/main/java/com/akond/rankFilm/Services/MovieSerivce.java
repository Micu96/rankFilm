package com.akond.rankFilm.Services;//package com.example.jdbc.demo.jdbc.Services;
//
//import com.example.jdbc.demo.jdbc.DTO.MovieDTO;
//import com.example.jdbc.demo.jdbc.repositiores.MovieRepo;
//import com.example.jdbc.demo.jdbc.repositiores.MovieRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.Optional;
//
//@Service
//public class MovieSerivce  {
//
//    @Autowired
//    MovieRepository repository;
//
//    private Connection connection;
//
//
//
//    public MovieDTO findByImdbId(String imdbId) {
//        repository.find();
//        return repository.findByImdbId(imdbId).map(MovieDTO::new).orElse(null);
//    }
//
//    public Optional<MovieDTO> findById(String id){
//        return repository.findById(id).map(MovieDTO::new);
//    }
//
////    public MovieDTO find(){
////        return repository.find().map(MovieDTO::new).orElse(null);
////    }
//
//    public MovieDTO find() throws SQLException {
//        connection = DriverManager
//                .getConnection("jdbc:mysql://127.0.0.1:3306/database", "root", "Kolega66.");
//
//        return MovieRepo.findByImdbId(connection);
//    }
//
//
//
//}
