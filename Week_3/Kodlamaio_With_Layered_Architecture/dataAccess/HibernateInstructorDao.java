package dataAccess;

import entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Added to database with Hibernate");
    }
}
