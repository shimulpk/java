
package pos;

import pos.dao.CategoryDao;
import pos.dao.SupplierDao;
import pos.dao.UserDao;
import pos.model.Category;
import pos.model.Supplier;
import pos.model.User;


public class POS {

    
    public static void main(String[] args) {
//        Category c=new Category("Mango");
//        CategoryDao cd=new CategoryDao();
//            cd.save(c);


//        Supplier s=new Supplier("Square", 
//                "09866", 
//                "Badrul", 
//                "67854", 
//                "Mohammadpur"
//        );
//        SupplierDao sd=new SupplierDao();
//        sd.save(s);


    CategoryDao categoryDao=new CategoryDao();
        System.out.println(categoryDao.findAll());
        
        
    }
    
}
