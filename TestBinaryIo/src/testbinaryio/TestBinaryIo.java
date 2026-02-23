
package testbinaryio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class TestBinaryIo {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        FileOutputStream fos=new FileOutputStream("C:\\Users\\hp\\Desktop\\shimul.dat");
    for(int i=1;i<=100;i++){
    fos.write(i);
    }
    fos.close();
    
        FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop\\shimul.dat");
         
         while(fis.read()!= -1){
         System.out.println(fis.read());
         }
    }
    
}
