/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classtestcrud;

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
public class ClassTestCrud {
     PreparedStatement ps;
     ResultSet rs;
     String sql;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       
    }
    
    public static Connection getCon(){
     Connection con=null;
   String url="jdbc:mysql://localhost:3306/jeestore";
    String user="root";
    String password="1234";
     String driver="com.mysql.cj.jdbc.Driver"; 
     
        try {
            Class.forName(driver);
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClassTestCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public void save(String name,double salary,String designation){
    String save="insert into employe(name,salary,designation)";
         try {
             ps.setString(1, name);
             ps.setDouble(2, salary);
             ps.setString(3, designation);
             ps.close();
         } catch (SQLException ex) {
             Logger.getLogger(ClassTestCrud.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    public void showEmploye(){
    String allEmploye="select * form employe";
    
         try {
             ps=getCon().prepareStatement(allEmploye);
             rs=ps.executeQuery();
             while(rs.next()){
                 System.out.println(rs.getInt("id")+ " "+ rs.getString("name")+" "+
                         rs.getDouble("salary")+" "+ rs.getString("designation"));
                 ps.close();
             }
         } catch (SQLException ex) {
             Logger.getLogger(ClassTestCrud.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    
}
