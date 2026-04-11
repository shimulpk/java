/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saturdaycrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class SaturdayCrud {

    public static PreparedStatement ps;
    public static ResultSet rs;
    public static String sql;
    public static void main(String[] args) {
        // TODO code application logic here
        
        save("shimul",50000, "id");
        showAll();
        System.out.println("------------------------------------------");
        update(1, "badrul", 3000, "computer");
        showAll();
        System.out.println("------------------------------------------");
        delete(2);
        showAll();
        System.out.println("------------------------------------------");
    }
    
    
    public static Connection getCon(){
    Connection con=null;
    String url="jdbc:mysql://localhost:3306/jeestore";
    String user="root";
    String password="1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaturdayCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SaturdayCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public static void save(String name,double salary,String department){
    
        sql="insert into employee(name,salary,department) values(?,?,?)";
        try {
            ps=getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setDouble(2, salary);
            ps.setString(3, department);
            
            ps.executeUpdate();
            ps.close();
            getCon().close();
            System.out.println("Saved");
        
        } catch (SQLException ex) {
            System.out.println("Not Saved");
            Logger.getLogger(SaturdayCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void showAll(){
    sql="select * from employee";
        try {
            ps=getCon().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                System.out.println("Id: "+rs.getInt("id")+" Name: "+rs.getString("name")+" Salary:"+rs.getDouble("salary")+" Department: "+rs.getString("department"));
            }
            
            ps.close();
            rs.close();
            getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(SaturdayCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void update(int id,String name,double salary,String department){
    sql="update employee set name=?,salary=?,department=? where id=?";
        try {
            ps=getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setDouble(2, salary);
            ps.setString(3, department);
            ps.setInt(4, id);
            
            ps.executeUpdate();
            ps.close();
            getCon().close();
            System.out.println("Updated");
            
           
        } catch (SQLException ex) {
            System.out.println("Not Updated");
            Logger.getLogger(SaturdayCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static  void delete(int id){
    sql="delete from employee where id=?";
        try {
            ps=getCon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(SaturdayCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
