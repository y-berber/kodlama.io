import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.HibernateInstructorDao;
import dataAccess.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main3232 {
    public static void main(String[] args) throws Exception{
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        List<Category> categories = new ArrayList<>();
        Category category1 = new Category(1, "Java Software");
        Category category2 = new Category(2,"C# Software");
//        Category category1 = new Category(3, "Java Software");   // Hata fırlatmalık örnek
//        Category category2 = new Category(4,"Java Software");    // Hata fırlatmalık örnek
        
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers , categories);
        categoryManager.add(category1);
        categoryManager.add(category2);
        
System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        
		Instructor instructor1 = new Instructor("Engin","Demirog");
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
        InstructorManager instructorManager1 = new InstructorManager(new JdbcInstructorDao(), loggers);
        instructorManager.add(instructor1);
        instructorManager1.add(instructor1);
        
System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        List<Course> courses = new ArrayList<>();
        Course course1 = new Course(1,"Camp1","Basic Course for Introduction to Programming",20,"Camp1Url",category1,instructor1);
        Course course2 = new Course(2,"Camp2","Basic Course for Introduction to Programming",20,"Camp2Url",category2,instructor1);

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers, courses);
        courseManager.add(course1);
        courseManager.add(course2);
    }
}