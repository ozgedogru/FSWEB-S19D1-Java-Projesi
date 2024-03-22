package com.workintech.sprint19.service;

import com.workintech.sprint19.entity.Actor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ActorService {
    List<Actor> getAllActors();
    Actor saveActor(Actor actor);
    Actor updateActor(Long id, Actor actor);
    Actor getActorById(Long id);

    void deleteActor(Long id);
}
