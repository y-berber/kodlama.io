package business;

import core.logging.Logger;
import dataAccess.ICourseDao;
import entities.Course;

import java.util.List;

public class CourseManager {
    private ICourseDao iCourseDao;
    private Logger[] loggers;
    private List<Course> courses;

    public CourseManager(ICourseDao iCourseDao, Logger[] loggers, List<Course> courses) {
        this.iCourseDao = iCourseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    public void add(Course course) throws Exception {
        for (Course course1: courses) {
            if(course1.getName() == course.getName()){
                throw new Exception("Courses with the same name cannot be entered.");
            }
        }
        if(course.getPrice() < 0){
            throw new Exception("Course price cannot be negative");
        }
        iCourseDao.add(course);
        courses.add(course);

        for (Logger logger: loggers) {
            logger.log(course.getName());
        }

    }
}
