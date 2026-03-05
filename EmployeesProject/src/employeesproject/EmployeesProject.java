/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeesproject;

import employeesproject.dao.EmployeesDao;
import employeesproject.model.Employees;

/**
 *
 * @author Admin
 */
public class EmployeesProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employees e=new Employees("Shimul", 50000, "s@gmail.com");
        EmployeesDao eDao=new EmployeesDao();
        eDao.save(e);
    }
    
}
