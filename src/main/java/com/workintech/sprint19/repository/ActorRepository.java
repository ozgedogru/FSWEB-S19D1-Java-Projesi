package com.workintech.sprint19.repository;

import com.workintech.sprint19.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Long> {
}
