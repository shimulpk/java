
package testgenerictype;

import entity.Student;
import java.util.ArrayList;

public class TestGenericType {

    
    public static void main(String[] args) {
        ArrayList<Student> sList=new ArrayList<>();
//        Student s=new Student(12, "shimul", "shimul@gmail.com");

sList.add(new Student(12, "shimul", "shimul@gmail.com"));
sList.add(new Student(13, "Abul", "Abul@gmail.com"));
sList.add(new Student());

        System.out.println(sList);
        
    }
    
}
