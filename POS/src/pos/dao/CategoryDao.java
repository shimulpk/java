
package pos.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pos.model.Category;
import pos.service.DaoService;
import pos.util.DbUtil;


public class CategoryDao implements DaoService<Category >{

    DbUtil db=new DbUtil();
    PreparedStatement ps;
    ResultSet rs;
    String sql;
    
    
    @Override
    public void save(Category e) {
        sql="insert into category(name)values(?)";
        try {
            ps=db.getcon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.executeUpdate();
            ps.close();
            db.getcon().close();
            
            JOptionPane.showMessageDialog(null, "Category Saved");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Category not Saved");
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public List<Category> findAll() {
        List<Category> list=new ArrayList<>();
        sql="Select * from category";
        try {
            ps=db.getcon().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            Category c=new Category(
                    rs.getInt("id"),
                    rs.getString("name"));
            list.add(c);
            }
            ps.close();
            rs.close();
            db.getcon().close();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
        
    }

    @Override
    public void update(Category e) {
        sql="update category set name=? where id=?";
        
        
        try {
            ps=db.getcon().prepareStatement(sql);
            
            ps.setString(1, e.getName());
            ps.setInt(2, e.getId());
            
            ps.executeUpdate();
            ps.close();
            db.getcon().close();
            
            JOptionPane.showMessageDialog(null, "Category update");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Category not update");
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Category findByID(int id) {
        Category c=null;
        sql="select * from category where id=?";
        try {
            ps=db.getcon().prepareStatement(sql);
            ps.setInt(1, id);
            
            rs=ps.executeQuery();
            while(rs.next()){
            c=new Category(
                    rs.getInt("id"), 
                    rs.getString("name")
            );
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    @Override
    public void delete(int id) {
        sql="delete from Category where id=?";
        try {
            ps=db.getcon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            db.getcon().close();
            
            JOptionPane.showMessageDialog(null, "Category Updated");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Categoory not Updated");
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
