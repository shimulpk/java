/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teacherproject.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;




import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import teacherproject.model.Teacher;
import teacherproject.util.DbUtil;









/**
 *
 * @author hp
 */
public class TeachersDao {
    
    DbUtil db=new DbUtil();
    PreparedStatement ps;
    ResultSet rs;
    String sql;
    
    public void save(Teacher t){
    sql="insert into teacher(name,designation,contact,salary) values(?,?,?,?)";
        try {
            ps=db.getCon().prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getDesignation());
            ps.setString(3, t.getContact());
            ps.setDouble(4, t.getSalary());
            
            ps.executeUpdate();
            
            ps.close();
            db.getCon().close();
            
            JOptionPane.showMessageDialog(null, "teachers are saved");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "teachers not saved");
            Logger.getLogger(TeachersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        public List<Teacher> findAll(){
        List<Teacher> list=new ArrayList<>();
        sql="select * from Teacher";
        try {
            ps=db.getCon().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            Teacher t=new Teacher(rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("designation"),
                    rs.getString("contact"),
                    rs.getDouble("salary")
            );
            list.add(t);
            }
            ps.close();
            rs.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(TeachersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
        }
}
   
   
    
    
    
  
            
    
   

