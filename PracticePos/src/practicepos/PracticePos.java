
package practicepos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;




public class PracticePos {

    
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "1234");
            
            PreparedStatement ps=connection.prepareStatement("select * from jeestore.student");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt("id")+rs.getString("name")+rs.getString("email")+rs.getString("address"));
                
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PracticePos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PracticePos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
    }
    
}
