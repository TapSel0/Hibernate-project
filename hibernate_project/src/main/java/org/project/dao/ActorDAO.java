package org.project.dao;

import org.hibernate.SessionFactory;
import org.project.domain.Actor;

public class ActorDAO extends GenericDAO<Actor> {
    public ActorDAO(SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}
