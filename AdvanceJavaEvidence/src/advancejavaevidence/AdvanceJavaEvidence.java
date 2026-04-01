/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package advancejavaevidence;

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
public class AdvanceJavaEvidence {

    /**
     * @param args the command line arguments
     */
    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {

    }

    public static Connection getcon() {
        String url = "jdbc:mysql://localhost:3306/practice";
        String user = "root";
        String password = "12345";
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdvanceJavaEvidence.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public static void createStudent(String name, String email, float fee) {

        String createSql = "insert into student(name,email,fee) values(?,?,?)";
        try {
            ps = getcon().prepareStatement(createSql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, fee);

            ps.executeUpdate();

            ps.close();
            getcon().close();

            System.out.println("Data Saved");
        } catch (SQLException ex) {
            System.out.println("Data not Saved");
            Logger.getLogger(AdvanceJavaEvidence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void showAllStudent() {
        String selectSql = "select * from student";

        try {
            ps = getcon().prepareStatement(selectSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String student = rs.getInt("id") + " " + rs.getString("name") + " " + rs.getString("email") + " " + rs.getFloat("fee");
                System.out.println(student);
            }
            rs.close();
            ps.close();
            getcon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaEvidence.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteStudent(int id) {

        String deleteSql = "delete from student where id=?";
        try {
            ps = getcon().prepareStatement(deleteSql);
            ps.setInt(1, id);

            int status = ps.executeUpdate();
            if (status > 0) {
                System.out.println("Student id" + id + "Delete");
            }
            ps.close();
            getcon().close();
        } catch (SQLException ex) {
            System.err.println("Student Data Not Deleted");
            Logger.getLogger(AdvanceJavaEvidence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateStudent(String name, String email, float fee, int id) {
        String updateSql = "update student set name =?, email = ?, fee=? where id=?";

        try {
            ps = getcon().prepareStatement(updateSql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, fee);
            ps.setInt(4, id);

            ps.executeUpdate();
            ps.close();
            getcon().close();
            System.out.println("Data Updated");
        } catch (SQLException ex) {
            System.err.println("Data Not Updated");
            Logger.getLogger(AdvanceJavaEvidence.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
