

package testarray;

import java.util.Arrays;


public class TestArray {

    public static void main(String[] args) {
        
        String studentsName[]=new String[14];
        int studentsAge[]=new int[14];
        
        studentsName[0]="Badrul";
        studentsName[0]="shimul";
        studentsName[0]="Hasan";
        
        studentsAge[0]=20;
        studentsAge[1]=20;
        
        studentsAge[3]=20;
        
      
        
        System.out.println(Arrays.toString(studentsName));
        System.out.println(Arrays.toString(studentsAge));
        
        System.out.println(studentsName[4]+ " "+studentsAge[4]);
        
        
        
        
        
    }
    
}
