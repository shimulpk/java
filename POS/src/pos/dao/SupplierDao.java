
package pos.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Supplier findByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
