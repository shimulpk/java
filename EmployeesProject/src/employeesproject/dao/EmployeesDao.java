/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeesproject.dao;

import employeesproject.model.Employees;
import employeesproject.util.DbUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class EmployeesDao {

    DbUtil db = new DbUtil();
    PreparedStatement ps;
    ResultSet rs;
    String sql;

    public void save(Employees e) {

        sql = "insert into employees(name,salary,email)values(?,?,?)";
        try {
            ps = db.getcon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setDouble(2, e.getSalary());
            ps.setString(3, e.getEmail());
            ps.executeUpdate();
            ps.close();
            db.getcon().close();
            JOptionPane.showMessageDialog(null, "Employees Saved");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Employees not Saved");
            Logger.getLogger(EmployeesDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Employees> getAllEmployees() {
        List<Employees> list = new ArrayList<>();
        sql = "select * from employees";
        try {
            ps = db.getcon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employees e = new Employees(rs.getInt("id"),
                        rs.getNString("name"),
                        rs.getDouble("salary"),
                        rs.getString("email")
                );
                list.add(e);

            }
            ps.close();
            rs.close();
            db.getcon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmployeesDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }
    
    public void update(Employees e){
        sql="update employees set name=?,salary=?,email=? where id=?";
        
        try {
            ps = db.getcon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setDouble(2, e.getSalary());
            ps.setString(3, e.getEmail());
            ps.setInt(4, e.getId());
            
            ps.close();
            db.getcon().close();
            JOptionPane.showMessageDialog(null, "Employees updated");
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Employees not updated");
            Logger.getLogger(EmployeesDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }

}
