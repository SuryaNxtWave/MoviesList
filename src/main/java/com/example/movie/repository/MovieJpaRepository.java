package com.example.movie.repository; 
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.movie.model.Movie;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieJpaRepository extends JpaRepository<Movie,Integer>{}