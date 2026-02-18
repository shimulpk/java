
package homeexceptionhandelar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HomeExceptionHandelar {

    
    public static void main(String[] args) {
         File file =new File("C:\\Users\\hp\\Desktop\\shimul.txt");
     
        try {
            Scanner s=new Scanner(file);
            while(s.hasNext()){
                System.out.println(s.hasNextLine());
            }
                   
           s.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HomeExceptionHandelar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
