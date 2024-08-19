package org.project.dao;

import org.hibernate.SessionFactory;
import org.project.domain.Address;
import org.project.domain.Category;

public class CategoryDAO extends GenericDAO<Category> {
    public CategoryDAO(SessionFactory sessionFactory) {
        super(Category.class, sessionFactory);
    }
}
