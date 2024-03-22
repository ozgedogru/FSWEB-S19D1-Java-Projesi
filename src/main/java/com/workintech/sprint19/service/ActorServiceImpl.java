package com.workintech.sprint19.service;

import com.workintech.sprint19.entity.Actor;
import com.workintech.sprint19.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ActorServiceImpl implements ActorService{
    private final ActorRepository actorRepository;

    @Autowired
    public ActorServiceImpl(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @Override
    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }
    @Override
    public Actor saveActor(Actor actor) {
        return actorRepository.save(actor);
    }

    @Override
    public Actor updateActor(Long id, Actor actor) {
        Actor existingActor = actorRepository.findById(id).orElse(null);
        if (existingActor != null) {
            actor.setId(id);
            return actorRepository.save(actor);
        }
        return null;
    }
    @Override
    public Actor getActorById(Long id) {
        return actorRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteActor(Long id) {
        actorRepository.deleteById(id);
    }
}
