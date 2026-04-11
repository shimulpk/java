/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;





/**
 *
 * @author hp
 */
public class StudentCrud {
 public static PreparedStatement ps;
 public static ResultSet rs;
 public static String sql;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        save("Anik", "anik@gmail.com", 50000);
        
        
        
    }
    
    public static Connection getCon(){
    Connection con=null;
    String url="jdbc:mysql://localhost:3306/mysql";
    String user="root";
    String password="1234";
    
     try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         con=DriverManager.getConnection(url, user, password);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(StudentCrud.class.getName()).log(Level.SEVERE, null, ex);
     } catch (SQLException ex) {
         Logger.getLogger(StudentCrud.class.getName()).log(Level.SEVERE, null, ex);
     }
     return con;
    }
    
    public static void save(String name,String email,double fee){
    sql="insert into student(name,email,fee) values(?,?,?)";
    
     try {
         ps=getCon().prepareStatement(sql);
         ps.setString(1, name);
         ps.setString(2, email);
         ps.setDouble(3, fee);
         
         ps.executeUpdate();
         ps.close();
         getCon().close();
         System.out.println("Saved");
         showAll();
         
     } catch (SQLException ex) {
         System.out.println("Not Saved");
         Logger.getLogger(StudentCrud.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
    public static void showAll(){
    sql="select * from student";
     try {
         ps=getCon().prepareStatement(sql);
         rs=ps.executeQuery();
         while(rs.next()){
             System.out.println("ID:"+rs.getInt("id")+"Name:"+rs.getString("name")+"Email:"+rs.getString("email")+"Fee:"+rs.getDouble("fee"));
             
         }
         ps.close();
         rs.close();
         getCon().close();
     } catch (SQLException ex) {
         Logger.getLogger(StudentCrud.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
    public static void update(int id,String name,String email,double fee){
    sql="update student set name=?,email=?,fee=? where id=?";
     try {
         ps=getCon().prepareStatement(sql);
         ps.setString(1, name);
         ps.setString(2, email);
         ps.setDouble(3, fee);
         ps.setInt(4, id);
         
         ps.executeUpdate();
         ps.close();
         getCon().close();
         
     } catch (SQLException ex) {
         Logger.getLogger(StudentCrud.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
    public static void delete(int id){
    sql="delete from student where id=?";
     try {
         ps=getCon().prepareStatement(sql);
         ps.setInt(1, id);
         ps.executeUpdate();
         ps.close();
         getCon().close();
         
     } catch (SQLException ex) {
         Logger.getLogger(StudentCrud.class.getName()).log(Level.SEVERE, null, ex);
     }
    
    }
    }
    
    
    

