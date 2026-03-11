/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicespos.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import practicespos.model.User;
import practicespos.service.DaoService;
import practicespos.util.DbUtil;

/**
 *
 * @author hp
 */
public class UserDao implements DaoService<User>{
    DbUtil db=new DbUtil();
    PreparedStatement ps;
    ResultSet rs;
    String sql=null;

    @Override
    public void save(User e) {
        sql="insert into user(userName,password) values(?,?)";
        try {
            ps=db.getCon().prepareStatement(sql);
            ps.setString(1, e.getUserName());
            ps.setString(2, e.getPassword());
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
            System.out.println("Data Saved");
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<User> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(User e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public User findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
