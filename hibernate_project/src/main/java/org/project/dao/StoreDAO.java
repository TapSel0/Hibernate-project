package org.project.dao;

import org.hibernate.SessionFactory;
import org.project.domain.Store;

public class StoreDAO extends GenericDAO<Store> {
    public StoreDAO(SessionFactory sessionFactory) {
        super(Store.class, sessionFactory);
    }
}
