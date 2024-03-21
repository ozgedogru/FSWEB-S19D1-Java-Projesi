package com.workintech.sprint19.service;

import com.workintech.sprint19.entity.Movie;
import org.springframework.stereotype.Service;

@Service
public interface MovieService {
    Movie saveMovie(Movie movie);

    Movie getMovieById(Long id);

    void deleteMovie(Long id);
}
