package com.workintech.sprint19.service;

import com.workintech.sprint19.entity.Actor;
import org.springframework.stereotype.Service;

@Service
public interface ActorService {
    Actor saveActor(Actor actor);

    Actor getActorById(Long id);

    void deleteActor(Long id);
}
