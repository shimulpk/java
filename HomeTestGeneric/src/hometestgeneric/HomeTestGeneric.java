
package hometestgeneric;

import entity.Teacher;
import entity1.Student;
import entity2.Staff;
import java.util.ArrayList;




public class HomeTestGeneric {

    
    public static void main(String[] args) {
        ArrayList<Teacher> tList=new ArrayList<>();
        tList.add(new Teacher(101, "Imran", "01619192323", "emran@gmail.com"));
        tList.add(new Teacher(102, "Mushahidul islam", "01678543987", "mushahidul@gmail.com"));
        
        ArrayList<Student> sList=new ArrayList<>();
        sList.add(new Student(1, "shimul", "01568186408", "Dhaka"));
        sList.add(new Student(2, "Badrul", "01765456789", "Dhaka"));
        sList.add(new Student(3, "Abul", "01765432312", "Dhaka"));
        
        ArrayList<Staff> sTaf=new ArrayList<>();
        
        sTaf.add(new Staff(201, "Farhad Hossen", "CM", "01345654378"));
        sTaf.add(new Staff(203, "Ashik", "Engineer", "01345432365"));
        
        
        System.out.println(sTaf);
        System.out.println(sList);
     
        System.out.println(tList);
        
        
    }
    
}
