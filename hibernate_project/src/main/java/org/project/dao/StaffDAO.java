package org.project.dao;

import org.hibernate.SessionFactory;
import org.project.domain.Staff;

public class StaffDAO extends GenericDAO<Staff> {
    public StaffDAO(SessionFactory sessionFactory) {
        super(Staff.class, sessionFactory);
    }
}
