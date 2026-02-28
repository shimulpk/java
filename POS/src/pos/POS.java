
package pos;

import pos.dao.CategoryDao;
import pos.dao.UserDao;
import pos.model.Category;
import pos.model.User;


public class POS {

    
    public static void main(String[] args) {
        Category c=new Category("Apple");
        CategoryDao dao=new CategoryDao();
//        dao.save(c);
        Category c1=dao.findByID(1);
        c1.setName("Banana");
        dao.update(c.getId());
        
        
    }
    
}
