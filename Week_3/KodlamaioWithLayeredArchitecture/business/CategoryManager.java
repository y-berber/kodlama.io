package business;

import core.logging.Logger;
import dataAccess.ICategoryDao;
import entities.Category;

import java.util.List;

public class CategoryManager {
    private ICategoryDao iCategoryDao;
    private Logger[] loggers;
    private List<Category> categories;

    public CategoryManager(ICategoryDao iCategoryDao, Logger[] loggers, List<Category> categories) {
        this.iCategoryDao = iCategoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    public void add(Category category) throws Exception {
        for (Category category1: categories) {
            if(category1.getName() == category.getName() ){
                throw new Exception("Categories with the same name cannot be entered");
            }
        }
        iCategoryDao.add(category);
        categories.add(category);

        for (Logger logger: loggers){
            logger.log(category.getName());
        }
    }
}
