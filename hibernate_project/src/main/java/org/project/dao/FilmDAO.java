package org.project.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.project.domain.Film;

public class FilmDAO extends GenericDAO<Film> {
    public FilmDAO(SessionFactory sessionFactory) {
        super(Film.class, sessionFactory);
    }

    public Film getFirstAvailableFilmForRent() {
        String queryString = "select f from Film f " +
                "where f.id not in " +
                "(select film.id from Inventory )";
        Query<Film> query = getCurrentSession().createQuery(queryString, Film.class);
        query.setMaxResults(1);
        return query.getSingleResult();
    }
}
