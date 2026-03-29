/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pos.model.Product;
import pos.service.DaoService;
import pos.util.DbUtil;

/**
 *
 * @author hp
 */
public class ProductDao implements DaoService<Product>{
    
    DbUtil db=new DbUtil();
    PreparedStatement ps;
    ResultSet rs;
    String sql;

    @Override
    public void save(Product e) {
        sql="insert into product(name,price,quantity,supplierId,categoryId) values(?,?,?,?,?)";
        try {
            ps=db.getcon().prepareStatement(sql);
            
            ps.setString(1, e.getName());
            ps.setDouble(2, e.getPrice());
            ps.setDouble(3, e.getQuantity());
            ps.setInt(4, e.getSupplierId());
            ps.setInt(5, e.getCategoryId());
            
            ps.executeUpdate();
            ps.close();
            db.getcon().close();
            JOptionPane.showMessageDialog(null, "Product Saved");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Product Not Saved");
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public List<Product> findAll() {
        List<Product> list=new ArrayList<>();
        sql="select p.id,p.name,p.price,p.quantity,s.name,c.name from product p "
                +" join supplier s on s.id=p.supplierId "
                +" join category c on c.id=p.categoryId ";
        try {
            ps=db.getcon().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){

Product p=new Product(rs.getInt("id"),
        rs.getString("name"), 
        rs.getDouble("price"), 
        rs.getDouble("quantity"), 
        rs.getString("s.name"), 
        rs.getString("c.name")
);
                System.out.println(list.size());
            list.add(p);
            }
            
            ps.close();
            rs.close();
            db.getcon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      return list;
    }

    @Override
    public void update(Product e) {
        sql="update product set name=?,price=?,quantity=?,supplierId=?,categoryId=? where id=?";
        try {
            ps=db.getcon().prepareStatement(sql);
            ps.setString(1, e.getName());
           ps.setDouble(2, e.getPrice());
           ps.setDouble(3, e.getQuantity());
           ps.setInt(4, e.getSupplierId());
           ps.setInt(5, e.getCategoryId());
           ps.setInt(6, e.getId());
           
           ps.executeUpdate();
           
           ps.close();
           db.getcon().close();
           
           JOptionPane.showMessageDialog(null, "Product Updated");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Product Not Updated");
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    @Override
    public Product findByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        sql="delete from product where id=?";
        try {
            ps=db.getcon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            ps.close();
            db.getcon().close();
            JOptionPane.showMessageDialog(null, "Product Deleted");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Product Not Deleted");
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
