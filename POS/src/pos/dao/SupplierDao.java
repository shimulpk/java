
package pos.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pos.model.Supplier;
import pos.service.DaoService;
import pos.util.DbUtil;


public class SupplierDao implements DaoService<Supplier>{
    DbUtil db=new DbUtil();
    PreparedStatement ps;
    ResultSet rs;
    String sql;

    @Override
    public void save(Supplier e) {
        sql="insert into supplier(name,cell,contactPersonName,contactPersonCell,address) values(?,?,?,?,?)";
        try {
            ps=db.getcon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setString(2, e.getCell());
            ps.setString(3, e.getContactPersonName());
            ps.setString(4, e.getContactPersonCell());
            ps.setString(5, e.getAddress());
            
            ps.executeUpdate();
            ps.close();
            db.getcon().close();
            System.out.println("Supplier Added");
            
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Supplier> findAll() {
        List<Supplier> list=new ArrayList<>();
        sql="select * from supplier";
        try {
            ps=db.getcon().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            Supplier supplier=new Supplier(
                    rs.getInt("id"), 
                    rs.getString("name"), 
                    rs.getString("cell"), 
                    rs.getString("contactPersonName"), 
                    rs.getString("contactPersonCell"), 
                    rs.getString("address")
            );
            
            list.add(supplier);
            }
            
            ps.close();
            rs.close();
            db.getcon().close();
            
            JOptionPane.showMessageDialog(null, "Supplier Added");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Supplier Not Added");
            
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      return list;
    }

    @Override
    public void update(Supplier e) {
        sql="update supplier set name=?,cell=?,contactPersonName=?,contactPersonCell=?,address=? where id=?";
        try {
            ps=db.getcon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setString(2, e.getCell());
            ps.setString(3, e.getContactPersonName());
            ps.setString(1, e.getContactPersonCell());
            ps.setString(1, e.getAddress());
            ps.setInt(0, e.getId());
            
            ps.executeUpdate();
            ps.close();
            db.getcon().close();
            
            JOptionPane.showMessageDialog(null, "Supplier Updated");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Supplier Updated");
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public Supplier findByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        sql="delete from supplier where id=?";
        try {
            ps=db.getcon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            db.getcon().close();
            
            JOptionPane.showMessageDialog(null, "Supplier deleted");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Supplier not deleted");
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
