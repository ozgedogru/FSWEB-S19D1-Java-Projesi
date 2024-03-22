package com.workintech.sprint19.service;

import com.workintech.sprint19.entity.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MovieService {
    List<Movie> getAllMovies();
    Movie saveMovie(Movie movie);
    Movie updateMovie(Long id, Movie movie);

    Movie getMovieById(Long id);

    void deleteMovie(Long id);
}
