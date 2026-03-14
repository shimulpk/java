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
public class ProdactDao implements DaoService<Product>{
    
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
            Logger.getLogger(ProdactDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public List<Product> findAll() {
        List<Product> list=new ArrayList<>();
        sql="select * from product";
        try {
            ps=db.getcon().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            Product p=new Product(rs.getInt("id"),
                    rs.getString("name"), 
                    rs.getDouble("price"), 
                    rs.getDouble("quantity"), 
                    rs.getInt("supplierId"), 
                    rs.getInt("categoryId")
            );
            list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdactDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      return list;
    }

    @Override
    public void update(Product e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Product findByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
