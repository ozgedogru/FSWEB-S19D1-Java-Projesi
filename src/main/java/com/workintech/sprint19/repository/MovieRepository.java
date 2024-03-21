package com.workintech.sprint19.repository;

import com.workintech.sprint19.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
