package business;

import core.logging.Logger;
import dataAccess.IInstructorDao;
import entities.Instructor;
public class InstructorManager {
    private IInstructorDao iInstructorDao;
    private Logger[] loggers;

    public InstructorManager(IInstructorDao iInstructorDao, Logger[] loggers) {
        this.iInstructorDao = iInstructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {
        for (Logger logger : loggers) {
            logger.log(instructor.getFirstName());
            logger.log(instructor.getLastName());
        }

        iInstructorDao.add(instructor);
    }
}
