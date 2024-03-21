package com.workintech.sprint19.service;

import com.workintech.sprint19.entity.Movie;
import com.workintech.sprint19.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MovieServiceImpl implements MovieService{
    private MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }
}
