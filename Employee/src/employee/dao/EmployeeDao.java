
package employee.dao;


import employee.model.EmployeDetails;
import employee.util.DbUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EmployeeDao {
    DbUtil db=new DbUtil();
    PreparedStatement ps;
    ResultSet rs;
    String sql;
    
    public void saveEmployee(EmployeDetails e){
    
    sql="insert into employeeDetails(name,contact,salary) values(?,?,?,?,?)";
        try {
            ps.getConnection().prepareStatement(sql);
            ps.setString(1,  e.getName());
            ps.setString(2, e.getContact());
            ps.setDouble(3, e.getSalary());
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
}
