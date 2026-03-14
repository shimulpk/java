/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicespos.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import practicespos.model.Category1;
import practicespos.service.DaoService;
import practicespos.util.DbUtil;

/**
 *
 * @author hp
 */
public class CategoryDao1 implements DaoService<Category1>{
    DbUtil db=new DbUtil();
    PreparedStatement ps;
    ResultSet rs;
    String sql;
    

    @Override
    public void save(Category1 e) {
        sql="insert into category1 (name) values(?)";
        try {
            ps=db.getCon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.executeUpdate();
            
            ps.close();
            db.getCon().close();
            
            JOptionPane.showMessageDialog(null, "Category1 Saved");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Category1 not Saved");
            Logger.getLogger(CategoryDao1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public List<Category1> findAll() {
        List<Category1> clist=new ArrayList<>();
        
        sql="select * from category1";
        try {
            ps=db.getCon().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            Category1 category1=new Category1(
                    rs.getInt("id"), 
                    rs.getString("name")
            );
            clist.add(category1);
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao1.class.getName()).log(Level.SEVERE, null, ex);
        }
      return clist;
    }

    @Override
    public void update(Category1 e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Category1 findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
