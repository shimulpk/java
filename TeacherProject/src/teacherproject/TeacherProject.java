/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teacherproject;

import teacherproject.dao.TeachersDao;
import teacherproject.model.Teacher;

/**
 *
 * @author hp
 */
public class TeacherProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Teacher t=new Teacher("Jorjia Khanm", "Lectururer", "05478764", 450000);
//        TeachersDao td=new TeachersDao();
//        td.save(t);

TeachersDao td=new TeachersDao();
        System.out.println(td.findAll());
        
        
    }
    
}
